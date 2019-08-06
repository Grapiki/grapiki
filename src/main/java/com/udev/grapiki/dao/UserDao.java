package com.udev.grapiki.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.udev.grapiki.model.User;

public class UserDao {

	public List<User> getUsers(){
		try(Connection connection = MyDataSource.getSingleton().getConnection();
				Statement stmt = connection.createStatement()){
				List<User> users = new ArrayList<User>();
				try(ResultSet rs = stmt.executeQuery("select id, alias, birthday, email, password, picture, registration_date, newsletter_subscription, deleted_account from user")){
					while(rs.next()) {
						User u = new User(rs.getInt("id"), rs.getString("alias"), rs.getString("birthday"), rs.getString("email"), rs.getString("password"), rs.getString("picture"), rs.getString("registration_date"), rs.getBoolean("newsletter_subscription"), rs.getBoolean("deleted_account"));
						users.add(u);
					}
				}
				return users;
			}catch(SQLException e) {
				throw new RuntimeException(e);
			}
	}
}
