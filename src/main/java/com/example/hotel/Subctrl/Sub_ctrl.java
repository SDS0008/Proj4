package com.example.hotel.Subctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Sub_ctrl {

	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		ModelAndView m1= new ModelAndView("index");
		
		
		return m1;
		
	}
	

	@RequestMapping("/Delete")
	public ModelAndView Delete() {
		
		ModelAndView m1= new ModelAndView("Delete");
		
		
		return m1;
		
		
		
	}
	
}
