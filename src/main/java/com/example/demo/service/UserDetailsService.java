package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.UserDetailsRepository;
import com.example.demo.entity.UserDetails;
@Component
public class UserDetailsService {
	
	@Autowired
	UserDetailsRepository repository;
	public void Addusers() {
		UserDetails user1 = new UserDetails("one@gmail.com","one123", "one", "Male",11111111, "HYD", "TG", "India");
		UserDetails user2 = new UserDetails("two@gmail.com","one13", "abhi", "feMale",115788611, "NLG", "AP", "India");
		UserDetails user3 = new UserDetails("anju@gmail.com","otye123", "anju", "Male",154484711, "HYD", "TI", "India");
		UserDetails user4 = new UserDetails("abhi@gmail.com","why123", "leo", "Male",476399321, "SYP", "KL", "India");
		UserDetails user5 = new UserDetails("sai@gmail.com","when123", "fok", "feMale",179406831, "HYD", "DL", "India");
		UserDetails user6 = new UserDetails("one@gmail.com","how123", "treat", "Male",197309831, "MLG", "TG", "India");
		UserDetails user7 = new UserDetails("leo@gmail.com","move123", "one", "Male",1375393671, "HYD", "TG", "India");
		UserDetails user8 = new UserDetails("tone@gmail.com","one123", "move", "feMale",16396391, "POK", "MI", "India");
		
		repository.saveAll(List.of(user1, user2, user3, user4, user5, user6, user7, user8));
		
	}
	
	public void findbyemailID(String emailId) {
		UserDetails userInfo = repository.findById(emailId).get();
		
		System.out.println(userInfo);
	}

	public void loadbycity (String city){
	List<UserDetails> user = repository.findbyCity(city);
	System.out.println(user);
		
	}
	
	public void loadbyGender(String gender) {
	List<UserDetails> userbygender = repository.findbyGender(gender);
}
}
