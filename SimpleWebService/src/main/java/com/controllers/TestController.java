package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

	@CrossOrigin(origins = "http://localhost")
	@GetMapping("/")
	public String Home() {
		
		return "[\r\n" + 
				"    {\"nombre\" : \"Pepito\",\r\n" + 
				"  \"apellido\" : \"Pérez\"},\r\n" + 
				"  {\"nombre\" : \"Jose\",\r\n" + 
				"  \"apellido\" : \"Castro\"},\r\n" + 
				"  {\"nombre\" : \"Ana\",\r\n" + 
				"  \"apellido\" : \"Prieto\"},\r\n" + 
				"  {\"nombre\" : \"Daniela\",\r\n" + 
				"  \"apellido\" : \"Cruz\"},\r\n" + 
				"  {\"nombre\" : \"Brayan\",\r\n" + 
				"  \"apellido\" : \"Vásquez\"}\r\n" + 
				"  ]";
	}
	
	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
}
