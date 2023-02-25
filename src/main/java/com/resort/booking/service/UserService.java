package com.resort.booking.service;

import java.util.List;

import com.resort.booking.model.Room;
import com.resort.booking.model.User;

public interface UserService {

	public void add(User user);

	public void update(User user);

	public void delete(String email);

	public User getUser(String email);

	public List<User> findAll();
	


}
