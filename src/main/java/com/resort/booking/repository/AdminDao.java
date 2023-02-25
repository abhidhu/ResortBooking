package com.resort.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resort.booking.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
	
}
