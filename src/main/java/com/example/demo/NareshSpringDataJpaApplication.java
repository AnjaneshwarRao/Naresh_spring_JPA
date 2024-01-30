package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserDetailsService;

@SpringBootApplication
public class NareshSpringDataJpaApplication {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(NareshSpringDataJpaApplication.class, args);
   UserDetailsService  service = context.getBean(UserDetailsService.class);
   service.Addusers();
   service.findbyemailID("one@gmail.com");
   service.loadbycity("HYD");
   service.loadbyGender(" Male");
	}


}
