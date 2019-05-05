package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
	@RequestMapping("/helloworld")
	public ModelAndView hello() {
 
		String helloWorldMessage = "Hello world....";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
}