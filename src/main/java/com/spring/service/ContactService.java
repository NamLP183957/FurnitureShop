package com.spring.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.entity.Contact;
import com.spring.entity.Image;
import com.spring.entity.Product;
import com.spring.entity.User;

@Service
public class ContactService {
	
	@Autowired
	ContactDAO contactDAO;
	
	public ModelAndView getListNewContact() {
		ModelAndView mav = new ModelAndView();
		List<Contact> listNewContact = contactDAO.getListContacts("notContact");
		mav.addObject("listContact", listNewContact);
		return mav;
	}
	
	public ModelAndView getListContactAndImage(User user) {
		ModelAndView mav = new ModelAndView();
		List<Contact> listContact = contactDAO.getListUserContacts("all", user);
		
		for (Contact contact : listContact) {
			Product product = contact.getProduct();
			Image image = product.getImages().get(0);
			image.setBase64Image(Base64.getEncoder().encodeToString(image.getContent()));
		}
		
		mav.addObject("listContact", listContact);
		
		return mav;
	}
}
