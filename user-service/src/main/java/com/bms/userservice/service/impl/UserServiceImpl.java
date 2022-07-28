package com.bms.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.userservice.controller.adapter.UserAdapter;
import com.bms.userservice.dto.UserDto;
import com.bms.userservice.repository.UserRepository;
import com.bms.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(UserDto userDto) {
		userRepository.save(UserAdapter.toEntity(userDto));
	}

}
