package com.sras.usersvc.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {

	private Integer userId;
	
	private String preferredName;
	
	private Integer age;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String address;
	
	private String phone;

	private String countryCode;
	
	private Integer roleId;	
}
