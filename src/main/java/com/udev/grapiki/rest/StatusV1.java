package com.udev.grapiki.rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.udev.grapiki.dao.MyDataSource;

@Path("/status")
public class StatusV1 {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
	
	/*@Path("/database")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAllAlias() {
		try(Connection connection = MyDataSource.getSingleton().getConnection();
			Statement stmt = connection.createStatement()){
			String alias = "";
			try(ResultSet rs = stmt.executeQuery("select alias from user")){
				while(rs.next()) {
					alias += rs.getString("alias");
				}
			}
			return alias;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}*/
	/*public String returnDatabaseStatus() throws Exception{
		PreparedStatement query;
		String myString = "";
		String returnString = "";
		Connection connection = null;
		
		try {
			connection = MyDataSource.getSingleton().getConnection();
			query = connection.prepareStatement("select alias from user limit 1");
			ResultSet rs = query.executeQuery();
			myString = rs.getString("alias");
			query.close();
			returnString = "<p> Alias : " + myString + "<p>";
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(connection != null) {
				connection.close();
			}
		}
		return returnString;
	}*/
}