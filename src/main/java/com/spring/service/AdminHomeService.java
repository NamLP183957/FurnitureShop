package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.DAO.ProductDAO;
import com.spring.entity.Product;

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
		List<Product> listProduct = productDAO.getProduct("all");
		
		mav.addObject("numberProduct", numberProduct);
		mav.addObject("numberContact", numberContact);
		mav.addObject("listProduct", listProduct);
		return mav;
	}
}
