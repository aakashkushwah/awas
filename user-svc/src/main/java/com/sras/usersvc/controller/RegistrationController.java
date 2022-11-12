package com.sras.usersvc.controller;

import java.util.List;

import com.sras.usersvc.model.entity.User;
import com.sras.usersvc.model.response.UserResponse;
import com.sras.usersvc.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@GetMapping("/getAllUsers")
	public List<UserResponse> getAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello Ji";
	}
	
	@PostMapping
	public String register(@RequestBody User user) {
		service.save(user);
		return "Hi "+user.getPreferredName()+" your registration process completed successfully";
	}
	
	@GetMapping("/findUser/{email}")
	public List<UserResponse> findUser(@PathVariable String email) {
		return service.findByEmail(email);
	}
	
	
}
