package org.spring.my.service;

import org.spring.my.dao.ProductDAO;
import org.spring.my.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImfo implements ProductService{
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Product selectOne(String pcode) {
		return productDAO.selctOne(pcode);
		
	}
	
	
}
