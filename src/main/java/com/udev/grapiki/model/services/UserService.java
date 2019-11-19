package com.udev.grapiki.model.services;

import java.util.List;
import java.util.Optional;

import com.udev.grapiki.dao.UserDao;
import com.udev.grapiki.model.User;
import com.udev.grapiki.model.exceptions.NotFoundException;

public class UserService {
	private UserDao dao = new UserDao();
	
	public List<User> getUsers(){
		return dao.getUsers();
	}
	
	public Optional<User> getUser(int id) throws NotFoundException{
		Optional<User> u = dao.getUser(id);
		if(u.isPresent()) {
			return u;
		}else {
			throw new NotFoundException("Cet utilisateur n'existe pas en base.");
		}
	}
	
	public Optional<User> getUser(String email) throws NotFoundException{
		Optional<User> u = dao.getUser(email);
		if(u.isPresent()) {
			return u;
		}else {
			throw new NotFoundException("Cet utilisateur n'existe pas en base.");
		}
	}

}
