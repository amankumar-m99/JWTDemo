package com.jwt.demo.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.demo.entity.User;
import com.jwt.demo.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("Getting users");
		return this.userService.getUsers();
	}

	@GetMapping("/current-user")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
