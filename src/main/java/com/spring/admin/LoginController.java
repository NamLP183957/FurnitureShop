package com.spring.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.AdminDAO;
import com.spring.service.AdminHomeService;

@Controller
@RequestMapping("/admin")
public class LoginController {
	
	//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath://spring-hibernate-config.xml");
	@Autowired
	AdminDAO adminDAO;
	
	@Autowired
	AdminHomeService adminHomeService;
	
	@RequestMapping(value = {"/", "/login"})
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("admin/login");
		mav.addObject("status", false);
		return mav;
	}
	
	@PostMapping(value = "/authenticate")
	public ModelAndView authenciate(HttpServletRequest request) {
		ModelAndView mav;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String passOfUsername = adminDAO.getAdmin(username);
		
		if(password.equals(passOfUsername)) {
			mav = adminHomeService.getHomeModel();
			mav.setViewName("admin/home");
			mav.addObject("status", true);
		}
		else {
			mav = new ModelAndView();
			mav.setViewName("admin/login");
			mav.addObject("status", false);
		}
		return mav;
	}
}
