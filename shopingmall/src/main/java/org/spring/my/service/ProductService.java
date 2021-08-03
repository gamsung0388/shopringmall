package org.spring.my.service;

import org.spring.my.dto.Product;

public interface ProductService {
	Product selectOne(String pcode);
}
