package com.hello.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CommonService {
	
	public int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch (Exception e) {
			return 0;
		}
	}
	
	public void log(String message) {
		System.out.println(message);
	}
	
	public void log(int message) {
		System.out.println(message);
	}

	public void log(List<Object> messages) {
		for( Object message : messages ) {
			System.out.println(message.toString());
		}
	}

	public void log(Object message) {
		System.out.println(message.toString());
	}
	
	
}
