package com.EM2.OnlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.EM2.OnlineShop.dao.CategoryDao;
import com.EM2.OnlineShop.entity.Category;

@Controller
public class MainController {

	@Autowired
	private CategoryDao CategoryDao;

	@RequestMapping(value = { "/", "/index", "/home" })
	public String home(ModelMap model) {

		model.addAttribute("pageTitle", "Home");
		model.addAttribute("categories", this.CategoryDao.getCategoryList());
		model.addAttribute("greeting", "Welcome to my e-commerce site");
		return "page";
	}

	@RequestMapping("/about")
	public String about(ModelMap model) {
		model.addAttribute("pageTitle", "About us");
		model.addAttribute("greeting", "Welcome to my e-commerce site");
		return "page";
	}

	@RequestMapping("/contact")
	public String contact(ModelMap model) {

		model.addAttribute("pageTitle", "Contact us");
		model.addAttribute("greeting", "Welcome to my e-commerce site");
		return "page";
	}

	/*
	 * Method to load all products
	 */
	@RequestMapping("/show/all/products")
	public String showAllProducts(ModelMap model) {

		model.addAttribute("categories", this.CategoryDao.getCategoryList());
		model.addAttribute("greeting", "Welcome to my e-commerce site");
		return "page";
	}

	@RequestMapping("/show/category/{id}/products")
	public String showCategoryProducts(ModelMap model, @PathVariable("id") int id) {
		Category category = null;
		category = this.CategoryDao.getCategory(id);
		model.addAttribute("categories", this.CategoryDao.getCategoryList());
		model.addAttribute("greeting", "Welcome to my e-commerce site");
		return "page";
	}
}
