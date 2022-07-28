package com.bms.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.userservice.dto.UserDto;
import com.bms.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
		return null;
	}
	
	
	@GetMapping("/health")
	private String health() {
		return "All fine";

	}
}
