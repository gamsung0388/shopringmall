package org.spring.my.service;

import org.spring.my.dao.GradeDAO;
import org.spring.my.dto.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImfo implements GradeService{
	
	@Autowired
	private GradeDAO gradeDAO;
	
	@Override
	public Grade selctOne(String gcode) {
		return gradeDAO.selectOne(gcode);
	}

}
