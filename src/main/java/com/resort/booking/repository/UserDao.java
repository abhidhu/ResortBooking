package com.resort.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.resort.booking.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
//	@Query("SELECT u User u WHERE  u.email = : email")
//	public User getUserByEmailId(@Param("email") String email);
	
	public boolean existsByEmail(String email);
	
}

 