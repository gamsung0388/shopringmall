package org.spring.my.service;

import org.spring.my.dao.GradeDAO;
import org.spring.my.dao.GuestDAO;
import org.spring.my.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellServiceImfo implements SellService{
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private GuestDAO guestDAO;
	
	@Autowired
	private GradeDAO gradeDAO;
	
	@Override
	public String Sellform(String pcode,String userid) {
		
		
		
		return userid;
		
	}
	
}
