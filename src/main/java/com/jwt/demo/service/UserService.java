package com.jwt.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.demo.entity.User;

@Service
public class UserService {
	List<User> users;

	public UserService() {
		users = new ArrayList<>();
		users.add(new User(101, "Aman", "aman@email.conm","pass101"));
		users.add(new User(102, "Aman2", "aman2@email.conm","pass102"));
		users.add(new User(103, "Aman3", "aman3@email.conm","pass103"));
	}

	public List<User> getUsers() {
		return users;
	}
}
