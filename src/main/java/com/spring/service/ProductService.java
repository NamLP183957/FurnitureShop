package com.spring.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ProductDAO;
import com.spring.entity.Image;
import com.spring.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDAO productDAO;
	
	public Product getProductAndImageService(Product product) {
		
		List<Image> listImage = product.getImages();
		
		List<Image> listTranferImage = new ArrayList<Image>();
		
		for(Image image : listImage) {
			image.setBase64Image(Base64.getEncoder().encodeToString(image.getContent()));
			listTranferImage.add(image);
		}
		
		product.setImages(listTranferImage);
		return product;
	}
	
	public ModelAndView getListNewProduct() {
		ModelAndView mav = new ModelAndView();
		List<Product> listNewProduct = productDAO.getListNewProduct();
		mav.addObject("listProduct", listNewProduct);
		return mav;
	}
}
