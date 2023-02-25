package com.resort.booking.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.resort.booking.model.Admin;
import com.resort.booking.model.Room;
import com.resort.booking.service.AdminService;
import com.resort.booking.service.RoomService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@Autowired
	RoomService roomService;

	@PostMapping("/admin_log")
	public String adminLog(@ModelAttribute("admin") Admin admin, Model model) {

		// System.out.println("inside the admin log in post");

		System.out.println(admin);
		
		ArrayList<Room> rooms=  (ArrayList<Room>) roomService.getAll();
		
		
		for(Room r: rooms) {
			
			model.addAttribute(r.getRoomName(), r.getPrice() );
			model.addAttribute(r.getRoomName()+"a", r.getNoOfRooms());
			
		}
		

		
		ArrayList<Admin> admins = (ArrayList<Admin>) adminService.login(admin);

		for (Admin a : admins) {
			if (a.getEmail().equals(admin.getEmail()) && a.getPassword().equals(admin.getPassword())) {
				return "admin";
			}
		}

		return "/admin_log";
	}

	@GetMapping("/admin_log")
	public String adminLog() {

		return "/admin_log";
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public AdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	@Override
	public String toString() {
		return "AdminController [adminService=" + adminService + "]";
	}

}
