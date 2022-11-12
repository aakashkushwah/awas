package com.sras.usersvc.service;

import com.sras.usersvc.model.entity.User;
import com.sras.usersvc.model.response.UserResponse;
import com.sras.usersvc.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository repository;

	public List<UserResponse> findAll() {
		return repository.getAll().stream().map(this::fromUser).collect(Collectors.toList());
	}

	public void save(User user) {
		repository.save(user);
	}

	public List<UserResponse> findByEmail(String email) {
		return repository.getByEmail(email).stream().map(this::fromUser).collect(Collectors.toList());
	}
	
	private UserResponse fromUser(User user) {
		return UserResponse.builder()
				.address(user.getAddress())
				.age(user.getAge())
				.email(user.getEmail())
				.firstName(user.getFirstName())
				.lastName(user.getLastName())
				.phone(user.getPhone()) 
				.preferredName(user.getPreferredName())
				.userId(user.getUserId())
				.build();
	}
	
}
