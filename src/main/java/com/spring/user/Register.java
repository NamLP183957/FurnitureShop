package com.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ProductDAO;
import com.spring.DAO.UserDAO;
import com.spring.entity.User;
import com.spring.service.HomepageService;
import com.spring.service.ProductService;

@Controller
@SessionAttributes("currentUser")
@RequestMapping("/user")
public class Register {
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	HomepageService homepageService;
	
	@RequestMapping("/register")
	public ModelAndView registerUser() {
		ModelAndView mav = new ModelAndView("user/register");
		mav.addObject("status", false);
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("user/login");
		mav.addObject("status", false);
		return mav;
	}
	
	@PostMapping("/saveUser")
	public ModelAndView saveUser(@RequestParam("firstName")String firstName, @RequestParam("lastName")String lastName,
								@RequestParam("address")String address, @RequestParam("email")String email, 
								@RequestParam("password")String password, @RequestParam("phoneNumber")String phoneNumber) {
		ModelAndView mav = new ModelAndView();
		
		User registerUser = new User(firstName, lastName, email, password, address, phoneNumber);
		if (userDAO.saveUser(registerUser)) {
			mav.setViewName("user/login");
		} else {
			mav.setViewName("user/register");
		}
		mav.addObject("status", false);
		return mav;
	}
	
	
	@PostMapping(value = "/authenticate")
	public ModelAndView authenticate(@RequestParam("email")String email, @RequestParam("password")String password) {
		ModelAndView mav = new ModelAndView();
		User user = userDAO.getUser(email, password);
		if(user == null) {
			mav.setViewName("user/login");
			mav.addObject("announcement", "Login failed! Email is not in system or password not true");
			mav.addObject("status", false);
		} else {
			mav = homepageService.getObjectOfHomepage("all");
			mav.addObject("currentUser", user);
			mav.setViewName("user/homepage");
		}
		return mav;
	}
}
