package org.spring.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.spring.my.dto.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GuestDAOImfo implements GuestDAO{
	@Autowired
	private SqlSession sqlsession;

	@Override
	public Guest selectOne(String userid) {
		return sqlsession.selectOne("org.spring.my.GuestMapper.selectOne",userid);
	}
	
	
}
