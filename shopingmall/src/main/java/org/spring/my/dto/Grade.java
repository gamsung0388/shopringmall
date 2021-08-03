package org.spring.my.dto;

import lombok.Data;

@Data
public class Grade {//등급
	private String gcode;//등급코드
	private String gname;//등급이름
	private int discount;//할인율
}
