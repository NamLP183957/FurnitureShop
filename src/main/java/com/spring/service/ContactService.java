package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.entity.Contact;

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
}
