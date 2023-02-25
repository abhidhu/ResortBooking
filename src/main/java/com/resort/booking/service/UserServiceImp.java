package com.resort.booking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resort.booking.model.Room;
import com.resort.booking.model.User;
import com.resort.booking.repository.UserDao;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub

		userDao.save(user);

	}

	

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		
		Iterable<User> users= userDao.findAll();
		
		List<User> u=new ArrayList<User>();
		
		users.forEach(e->{u.add(e);});
		
		
		return u;
		
		
	}

	@Override
	public String toString() {
		return "UserServiceImp [userDao=" + userDao + "]";
	}

	public UserServiceImp(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public UserServiceImp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
