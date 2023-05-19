package com.hello.spring.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.hello.spring.form.UserForm;

import lombok.Data;

@Data
public class UserEntity{
	
	private int id;
	
	private String username;
	
	private String email;
	
	private Date birthDay;
	
	public UserForm toForm() {
		UserForm userForm = new UserForm();
		userForm.setId( String.valueOf( id ) );
		userForm.setUsername( username );
		userForm.setEmail( email );
		// format date with SimpleDateFormat
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		userForm.setBirthDay( dateFormat.format(birthDay) );
		return userForm;
	}
}