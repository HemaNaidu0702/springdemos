package com.examples.S08SpringMVCORMDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.examples.S08SpringMVCORMDemo.entity.User;
import com.examples.S08SpringMVCORMDemo.exception.UserAlreadyExistException;
import com.examples.S08SpringMVCORMDemo.services.UserService;



@Controller
public class UserController {
 
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String showRegistrationPage() {
	      return "userreg";
	}
	
	@RequestMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result;
		try {
			result = userService.save(user);
			 model.addAttribute("message", "user created in db with id " + result);
			    model.addAttribute("users", userService.getUsers());
		} catch (UserAlreadyExistException e) {
			 model.addAttribute("message", e.getMessage());
		}
		
	   
		
		return "userreg";
	}
	
	

}
