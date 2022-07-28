package com.bms.userservice.controller.adapter;

import com.bms.userservice.dto.UserDto;
import com.bms.userservice.model.UserEntity;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserAdapter {
	public static UserEntity toEntity(UserDto userDto){
		return UserEntity.builder()
				.name(userDto.getName())
				.userName(userDto.getUserName())
				.password(userDto.getEmail())
				.email(userDto.getEmail())
				.phoneNumber(userDto.getPassword())
				.build();
	}
}
