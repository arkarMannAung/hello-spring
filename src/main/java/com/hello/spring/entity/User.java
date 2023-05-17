package com.hello.spring.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User{
	
	private int id;
	
	private String username;
	
	private int email;
	
	private Date bDate;
}