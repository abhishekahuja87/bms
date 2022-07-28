package com.bms.userservice.dto;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class UserDto {

	public String name;
	public String userName;
	public String password;
	public String email;
	public String phoneNumber;
}
