package com.spring.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.ProductDAO;
import com.spring.entity.Image;
import com.spring.entity.Product;
import com.spring.service.ProductService;

@Controller
@SessionAttributes("currentUser")
@RequestMapping(value = "/user")
public class DetailProductController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired 
	ProductService productService;
	
	@RequestMapping(value = "/ChiTiet")
	public ModelAndView getDetailProduct(@RequestParam("id")int id) {
		ModelAndView mav = new ModelAndView("user/chi_tiet");
		Product product = productService.getProductAndImageService(productDAO.getProductDetail(id));
		List<Image> listImage = product.getImages();
		
		
		mav.addObject("product", product);
		mav.addObject("listImage", listImage);
		mav.addObject("mainImage", listImage.get(0));
		return mav;
	}
	
	@RequestMapping("/Order")
	public ModelAndView getOrder(@RequestParam("id")int id) {
		ModelAndView mav = new ModelAndView("user/order");
		Product product = productService.getProductAndImageService(productDAO.getProductDetail(id));
		Image mainImage = product.getImages().get(0);
		
		mav.addObject("product", product);
		mav.addObject("image", mainImage);
		return mav;
	}
}
