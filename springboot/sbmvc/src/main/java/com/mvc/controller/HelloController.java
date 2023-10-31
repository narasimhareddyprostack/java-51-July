package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/index")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
	@GetMapping("/servcie")
	public ModelAndView servicePage() {
		return new ModelAndView("service");
	}
	@GetMapping("/contact")
	public ModelAndView ContactPage() {
		return new ModelAndView("contact");
	}
	@GetMapping("/product")
	public ModelAndView productPage() {
		return new ModelAndView("product");
	}
}
