package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ProductDAO;
import com.spring.entity.Product;

@Service
public class HomepageService {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	ProductService productService;
	
	public ModelAndView getObjectOfHomepage(String style) {
		List<Product> listProduct = productDAO.getProductByStyle(style);
		ModelAndView mav = new ModelAndView();
		
		for (Product product : listProduct) {
			product = productService.getProductAndImageService(product);
		}
		
		Product bestProduct = listProduct.get(0);
		mav.addObject("bestProduct", bestProduct);
		mav.addObject("bestSellImage", bestProduct.getImages().get(0));
		
		List<Product> products = new ArrayList<Product>();
		
		int size = listProduct.size();
		
		for (int i = 1; i < size; i++) {
			products.add(listProduct.get(i));
		}
		
		mav.addObject("products", products);
		return mav;
	}
}
