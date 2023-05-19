package com.hello.spring.form;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.hello.spring.entity.UserEntity;
import com.hello.spring.service.TypeHandler;

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
	
	@NotBlank(message="date is required!")
	private String birthDay;
	
	public UserEntity toEntity() {
		// TypeHandler for Error Hanle
		TypeHandler type = new TypeHandler();
		
		UserEntity userEntity = new UserEntity();
		
		userEntity.setId( type.parseInt( id ) );
		userEntity.setUsername( username );
		userEntity.setEmail( email );
		userEntity.setBirthDay( type.parseDate( birthDay ) );
		
		return userEntity;
	}
}

