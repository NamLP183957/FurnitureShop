package com.spring.user;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ContactDAO;
import com.spring.DAO.ProductDAO;
import com.spring.entity.Contact;
import com.spring.entity.Product;
import com.spring.entity.User;
import com.spring.service.HomepageService;
import com.spring.service.ProductService;

@Controller
@SessionAttributes("currentUser")
@RequestMapping("/user")
public class OrderController {

	@Autowired
	ProductService productService;
	
	@Autowired
	HomepageService homepageService;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	ContactDAO contactDAO;
	
	@PostMapping(value = "/saveOrder")
	public ModelAndView saveOrder(@RequestParam("productId")int productId, @RequestParam("number")int numberProduct, 
								@RequestParam("userName")String userName, @ModelAttribute("currentUser")User currentUser,
								@RequestParam("phoneNumber")String phoneNumber, @RequestParam("address")String address) {
		ModelAndView mav = homepageService.getObjectOfHomepage("all");
		long milis = System.currentTimeMillis();
		Date startDateTime = new Date(milis);
		Contact contact = new Contact(numberProduct, false, startDateTime, userName, phoneNumber, address);
		Product product = productDAO.getProductDetail(productId);
		product = productService.getProductAndImageService(product);
		
		contact.setProduct(product);
		currentUser.setContacts(new ArrayList<Contact>());
		currentUser.addContact(contact);
		contactDAO.saveContact(contact);
		
		mav.setViewName("user/trang_chu");
		return mav;
	}
}
