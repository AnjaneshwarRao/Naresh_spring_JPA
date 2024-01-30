package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {

	
	List<UserDetails>findbyCity(String city);
	List<UserDetails> findbyGender(String gender);
}
