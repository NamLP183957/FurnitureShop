package com.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ProductDAO;
import com.spring.service.HomepageService;
import com.spring.service.ProductService;

@Controller
@SessionAttributes("currentUser")
@RequestMapping("/user")
public class TrangChuController {	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	HomepageService homepageService;
	
	@RequestMapping("/")
	public ModelAndView getHome() {
		ModelAndView mav = homepageService.getObjectOfHomepage();
		mav.setViewName("user/homepage");
		return mav;
	}
}
