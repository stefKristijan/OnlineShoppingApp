package com.EM2.OnlineShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index", "/home" })
	public String home(ModelMap model) {

		model.addAttribute("greeting", "Welcome to my e-commerce site");
		return "home";
	}
}
