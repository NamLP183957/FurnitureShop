package com.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/trangChu")
	public ModelAndView getHome() {
		ModelAndView mav = homepageService.getObjectOfHomepage("all");
		mav.setViewName("user/homepage");
		return mav;
	}
	
	@RequestMapping("/sanPham")
	public ModelAndView getListProduct(@RequestParam("style")String style) {
		ModelAndView mav = homepageService.getObjectOfHomepage(style);
		mav.setViewName("user/homepage");
		return mav;
	}
}
