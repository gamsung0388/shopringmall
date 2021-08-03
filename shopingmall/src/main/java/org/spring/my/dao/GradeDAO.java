package org.spring.my.dao;

import org.spring.my.dto.Grade;

public interface GradeDAO {
	Grade selectOne(String gcode);
}
