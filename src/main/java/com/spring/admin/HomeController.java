package com.spring.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.AdminHomeService;
import com.spring.service.ContactService;
import com.spring.service.ProductService;

@Controller
@RequestMapping("/admin")
public class HomeController {

	@Autowired
	AdminHomeService adminHomeService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/home")
	public ModelAndView getHomepage() {
		ModelAndView mav = adminHomeService.getHomeModel();
		mav.setViewName("admin/home");
				
		return mav;
	}
	
	@RequestMapping(value = "/listNewProduct")
	public ModelAndView getNewProduct() {
		ModelAndView mav = productService.getListNewProduct();
		mav.setViewName("admin/product");
		return mav;
	}
	
	@RequestMapping(value = "/listNewContact")
	public ModelAndView getNewContact() {
		ModelAndView mav = contactService.getListNewContact();
		mav.setViewName("admin/list_contact");
		return mav;
	}
}
