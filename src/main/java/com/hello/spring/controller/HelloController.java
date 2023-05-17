package com.hello.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hello.spring.entity.User;
import com.hello.spring.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@GetMapping("/")
	public String index(Model model) {
		String input = "1000";
		
		int num = parseInt(input); //
		
		log(num+"");
		
		return "screens/index";
	}
	
	private void log(String msg) {
		System.out.println(msg);
	}
	
	public int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch (Exception e) {
			return 0;
		}
	}
	
}
