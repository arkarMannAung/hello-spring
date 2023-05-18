package com.hello.spring.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserForm {
	
	private String id;
	
	@NotEmpty(message="username is required!")
	private String username;
	
	@NotBlank(message="email is required!")
	private String email;
	
	private String bDate;
}

