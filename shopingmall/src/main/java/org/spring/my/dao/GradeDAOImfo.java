package org.spring.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.spring.my.dto.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GradeDAOImfo implements GradeDAO{
	@Autowired
	private SqlSession sqlsession;

	@Override
	public Grade selectOne(String gcode) {
		return sqlsession.selectOne("org.spring.my.GradeMapper.selectOne",gcode);
	}
	
	
}
