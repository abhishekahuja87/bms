package com.bms.userservice.service;

import org.springframework.stereotype.Service;

import com.bms.userservice.dto.UserDto;

@Service
public interface UserService {

	public void addUser(UserDto userDto);
	
}
