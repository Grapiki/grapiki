package com.udev.grapiki.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.udev.grapiki.dao.MyDataSource;

@Path("/status2")
public class StatusV2 {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
	
	@Path("/database")
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
	}
}
