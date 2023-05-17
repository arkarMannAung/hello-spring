package com.hello.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String index(Model model) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Amie");
		nameList.add("Amie1");
		nameList.add("Amie2");
		nameList.add("Amie3");
		nameList.add("Amie4");
		model.addAttribute("names",nameList);
		
		model.addAttribute("title","Hello World");
		return "screens/index";
	}
}
