package com.learn.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author ranjeet.kumar
 *
 */
@Controller
public class HelloController {
	@GetMapping
	public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("user", name);
		return "hello";

	}

}
