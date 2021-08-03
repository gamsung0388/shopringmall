package org.spring.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.spring.my.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImfo implements ProductDAO{

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public void insert(Product product) {
		sqlsession.insert("org.spring.my.ProductMapper.insert",product);
		
	}
	
	@Override
	public Product selctOne(String pcode) {
		return sqlsession.selectOne("org.spring.my.ProductMapper.selectOne",pcode);
	}

	
}
