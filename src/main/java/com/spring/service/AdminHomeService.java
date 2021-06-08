package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.DAO.ProductDAO;

@Service
public class AdminHomeService {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	ContactDAO contactDAO;
	
	public ModelAndView getHomeModel() {
		ModelAndView mav = new ModelAndView();
		int numberProduct = productDAO.getListNewProduct().size();
		int numberContact = contactDAO.getListContacts("notContact").size();
		
		mav.addObject("numberProduct", numberProduct);
		mav.addObject("numberContact", numberContact);
		return mav;
	}
}
