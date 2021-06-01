package com.spring.service;

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
	
	public ModelAndView getObjectOfHomepage() {
		ModelAndView mav = new ModelAndView();
		Product product = productDAO.getBestSell();
		Product bestSellProduct = productService.getProductAndImageService(product);
		List<Image> listImage = bestSellProduct.getImages();
		mav.addObject("bestProduct", bestSellProduct);
		mav.addObject("bestSellImage", listImage.get(0));		
		return mav;
	}
}
