package com.hello.spring.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TypeHandler {
	
	public Integer parseInt(String intString) {
		try {
			return Integer.valueOf(intString);
		}catch(Exception e) {
			return 0;
		}
	}
	
	public Date parseDate(String dateString,SimpleDateFormat format) {
		try {
			return format.parse(dateString);
		}catch(Exception e) {
			return new Date(); 
		}
	}
	
	public Date parseDate(String dateString) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.parse(dateString);
		}catch(Exception e) {
			return new Date();
		}
	}
}
