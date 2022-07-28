package com.bms.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class UserEntity {

	public String name;
	public String userName;
	public String password;
	public String email;
	@Id
	public String phoneNumber;
}
