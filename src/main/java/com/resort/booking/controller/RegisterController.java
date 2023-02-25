package com.resort.booking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.resort.booking.model.User;
import com.resort.booking.service.UserService;
import com.resort.booking.service.UserServiceImp;

@Controller
public class RegisterController {

	@Autowired
	UserServiceImp userService;

	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user) {

		userService.add(user);
		
		System.out.println(user);

		System.out.println("inside register controller in register method");

		return "index";
	}

	// start
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		
		

		String password = user.getPassword();
		String email = user.getEmail();
		
		if(password==null || email==null) {
			return "login";
		}

		ArrayList<User> users = (ArrayList<User>) userService.findAll();
		
		if(users==null) {
			return "login";
		}

		for(User u: users) {
			System.out.println(u);
			if(u.getEmail()==null || u.getPassword()==null) {
				continue;
			}
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				System.out.println("you are in!!!\n \n \n \n ");
				return "index";
			}
		}

		System.out.println("request user " + user);

		return "login";
	}

	@Override
	public String toString() {
		return "RegisterController [userService=" + userService + "]";
	}

	public RegisterController(UserServiceImp userService) {
		super();
		this.userService = userService;
	}

	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserServiceImp userService) {
		this.userService = userService;
	}

}
