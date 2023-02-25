package com.resort.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resort.booking.model.Admin;
import com.resort.booking.repository.AdminDao;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	public List<Admin> login(Admin admin) {
		// TODO Auto-generated method stub
		Iterable<Admin> admins = adminDao.findAll();

		ArrayList<Admin> list = new ArrayList<Admin>();

		admins.forEach(e -> {
			list.add(e);
		});

		return list;
	}

	public AdminServiceImp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminServiceImp(AdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}

	@Override
	public String toString() {
		return "AdminServiceImp [adminDao=" + adminDao + "]";
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

}
