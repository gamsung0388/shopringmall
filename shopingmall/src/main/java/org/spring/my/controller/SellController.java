package org.spring.my.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.my.dto.Product;
import org.spring.my.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.spring.my.service.GuestService;
import org.spring.my.dto.Guest;
import org.spring.my.dto.Grade;
import org.spring.my.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("sell")
@Controller
public class SellController {
	private static final Logger logger = LoggerFactory.getLogger(SellController.class);
	
	
	  @Autowired 
	  private ProductService productservice;
	 
	 @Autowired 
	 private GuestService guestService;
	  
	 @Autowired 
	 private GradeService gradeService;
	 
	
	//장바구니로 이동
	@GetMapping("box")
	public String Sellform(String pcode,String userid,Model model) {
		//상품 정보
		pcode = "001";
		userid = "java";
		Product product = productservice.selectOne(pcode);
		//등급값을 가져오기위한 고객정보값
		Guest guest = guestService.selectOne(userid);
		//등급--할인율
		
		Grade grade =gradeService.selctOne(guest.getGcode());
		logger.info(product.toString());
		logger.info(grade.toString());
		logger.info(guest.toString());
		
		model.addAttribute(product);
		model.addAttribute(grade);
		model.addAttribute(guest);
		
		return "Sell/Sellform";
	}
	
	
}
