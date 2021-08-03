package org.spring.my.dao;


import org.spring.my.dto.Product;

public interface ProductDAO {
	public void insert(Product product);
	public Product selctOne(String Pcode);
}
