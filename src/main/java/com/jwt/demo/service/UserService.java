package com.jwt.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.demo.entity.User;
import com.jwt.demo.repository.UserRepository;

@Service
public class UserService {

	// In-memory users method
	/*
	private List<User> users;

	public UserService() {
		users = new ArrayList<>();
		users.add(new User("101", "Aman", "aman@email.conm","pass101"));
		users.add(new User("102", "Aman2", "aman2@email.conm","pass102"));
		users.add(new User("103", "Aman3", "aman3@email.conm","pass103"));
	}

	public List<User> getUsers() {
		return users;
	}
	*/

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	public User createUser(User user) {
		user.setId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
}
