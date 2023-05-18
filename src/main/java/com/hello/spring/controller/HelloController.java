package com.hello.spring.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.spring.form.UserForm;
import com.hello.spring.service.CommonService;
import com.hello.spring.service.HelloService;

import jakarta.validation.Valid;

@Controller
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@Autowired
	CommonService helper;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("id",12);
		model.addAttribute("name","Jhon Doe");
		model.addAttribute("age",23);
		
//		UserForm userForm = new UserForm();
//		userForm.setUsername("Hello World, 08896");
		model.addAttribute("userForm", new UserForm());
		return "screens/index";
	}
	
	// pathVariable
	@GetMapping("/send-by-path/{id}/{name}")
	public String byPath(@PathVariable int id,@PathVariable String name) {		
		helper.log(id);
		helper.log(name);
		return "redirect:/";
	//	return "screens/signup";
	}
	
	// param
	@GetMapping("/send-by-parm")
	public String byParam(@RequestParam String name,@RequestParam int age) {
		helper.log(name);
		helper.log(age);
		
		return "redirect:/";
	}
	
	// model attribute
	@PostMapping("/send-by-model")
	public String byModel(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult result ) {
		
		if( result.hasErrors() ) {
			return "screens/index";
		}
		
		// db: query 
		
//		for( FieldError error : result.getFieldErrors() ) {
//			helper.log( error.getField() + " : " +error.getDefaultMessage() );
//		}
		
//		helper.log(userForm);
		
		return "redirect:/";
	}
	
	
	
	
	// 1.get 
	// 2.index 
		// user/1   GET => path
	
	// 3.create 
		// user/create	POST => ModelAttribute or RequestBody
	// 4.update 
		// user/update/1    POST => ModelAttribute or RequestBody
	// 5.delete
		// user/delete/1
	
	// user?id=1&name=aar kar
	
	
	
}
