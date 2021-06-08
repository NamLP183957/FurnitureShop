package com.spring.admin;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.entity.Contact;
import com.spring.entity.ProductStatistic;

@Controller
@RequestMapping(value = "/admin")
public class ContactController {
	
	@Autowired
	ContactDAO contactDAO;
	
	@RequestMapping("/listContact")
	public ModelAndView getListContact(@RequestParam("status")String status) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/list_contact");
		
		List<Contact> listContact = contactDAO.getListContacts(status);
		
		mav.addObject("listContact", listContact);
		
		return mav;
	}
	
	@RequestMapping("/contactDetail")
	public ModelAndView getContactDetail(@RequestParam("contactID")int contactID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/contact_detail");
		
		Contact contact = contactDAO.getContactDetail(contactID);
		mav.addObject("contact", contact);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String startDate = formatter.format(contact.getStartDate());
		mav.addObject("startDate", startDate);
		return mav;
	}
	
	@RequestMapping("/statistic")
	public ModelAndView getStatistic() {
		ModelAndView mav = new ModelAndView("admin/statistic");
		List<ProductStatistic> listProductDesign = contactDAO.statisticByType("design_pattern");
		List<ProductStatistic> listProductDecorator = contactDAO.statisticByType("docorator_product");
		
		mav.addObject("listProductDesign", listProductDesign);
		mav.addObject("listProductDecorator", listProductDecorator);
		return mav;
	}
}
