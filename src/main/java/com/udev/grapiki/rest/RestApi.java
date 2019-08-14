package com.udev.grapiki.rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.udev.grapiki.dao.MyDataSource;
import com.udev.grapiki.dao.UserDao;
import com.udev.grapiki.model.User;
import com.udev.grapiki.model.services.UserService;
import com.udev.grapiki.model.exceptions.NotFoundException;

@Path("/users")
public class RestApi {
	
	private UserService uServ = new UserService();

	@GET
	@Produces({ "application/json", "application/xml" })
	public List<User> getAllUsers() {
		return uServ.getUsers();
	}
	
	@Path("/{id}")
	@GET
	@Produces({ "application/json", "application/xml" })
	public User get(@PathParam("id") int id) throws NotFoundException{
		User u = null;
		u = uServ.getUser(id).get();
		return u;
	}
	
	@Path("/email/{email}")
	@GET
	@Produces({ "application/json", "application/xml" })
	public User get(@PathParam("email") String email)  throws NotFoundException{
		User u = null;
		u = uServ.getUser(email).get();
		return u;
	}
}