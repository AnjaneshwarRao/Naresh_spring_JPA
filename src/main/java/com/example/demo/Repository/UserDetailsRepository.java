package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, String> {

}
