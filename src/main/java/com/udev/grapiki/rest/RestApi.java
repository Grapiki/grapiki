package com.udev.grapiki.rest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	@Path("/user/{id}")
	@GET
	@Produces({ "application/json", "application/xml" })
	public User get(@PathParam("id") int id) {
		User u = null;
		try {
			u = uServ.getUser(id).get();
		}catch(NotFoundException nfe) {
			nfe.printStackTrace();
		}
		return u;
	}
	
	@Path("/user/email/{email}")
	@GET
	@Produces({ "application/json", "application/xml" })
	public User get(@PathParam("email") String email) {
		User u = null;
		try {
			u = uServ.getUser(email).get();
		}catch(NotFoundException nfe) {
			nfe.printStackTrace();
		}
		return u;
	}
}