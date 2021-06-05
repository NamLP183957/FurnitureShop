package com.spring.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.entity.Contact;

@Controller
@RequestMapping(value = "/admin")
public class ContactController {
	
	@Autowired
	ContactDAO contactDAO;
	
	@RequestMapping("/listContact")
	public ModelAndView getListContact(@RequestParam("status")String status) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/list_contact");
		
		List<Contact> listContact = contactDAO.getListProduct(status);
		
		mav.addObject("listContact", listContact);
		
		return mav;
	}
}
