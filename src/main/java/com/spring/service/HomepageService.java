package com.spring.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ProductDAO;
import com.spring.entity.Image;
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
		
		Product bestProduct = listProduct.get(0);
		Image bestSellImage = bestProduct.getImages().get(0);
		bestSellImage.setBase64Image(Base64.getEncoder().encodeToString(bestSellImage.getContent()));
		mav.addObject("bestProduct", bestProduct);
		
		List<Product> products = new ArrayList<Product>();
		
		int size = listProduct.size();
		
		for (int i = 1; i < size; i++) {
			Product product = listProduct.get(i);
			Image image = product.getImages().get(0);
			image.setBase64Image(Base64.getEncoder().encodeToString(image.getContent()));
			products.add(product);
			
		}
		
		mav.addObject("products", products);
		
		Long milis = System.currentTimeMillis();
		Date currentDate = new Date(milis);
		int currentMonth = currentDate.getMonth();
		mav.addObject("currentMonth", currentMonth);
		return mav;
	}
}
