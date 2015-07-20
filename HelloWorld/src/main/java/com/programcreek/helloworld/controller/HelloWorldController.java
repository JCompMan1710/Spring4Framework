package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	String message = "Welcome to John Stephenson's Web Page!";

	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		
		return mv;
	}

}
