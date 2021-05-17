package com.sai.ayra.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@GetMapping("/list")
	public String showForm() {
		return "list-customers";
	}

}
