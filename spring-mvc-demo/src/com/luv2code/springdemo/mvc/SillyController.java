package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class SillyController {

	@RequestMapping("/showForm")
	public String displayTheForm() {

		return "silly world";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("theStudent: " + theStudent.getFirstName()	
						+ " " + theStudent.getLastName());
		return "student-confirmation";
		
	}
}
