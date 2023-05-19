package com.hello.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.hello.spring.form.UserForm;

@Service
public class CommonService {
	
	public boolean userFormValidator(UserForm userForm, Model model) {
		
		// handle for id :: int
		try {
			Integer.valueOf(userForm.getId());
		}catch(Exception e) {
			model.addAttribute("id_error","your id is not invalid!");
			return false;
		}
		
		// home work
		// handel for birthDay :: Date
		
		return true;
	}
	
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
