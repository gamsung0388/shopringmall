package org.spring.my.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Guest {//고객
	private String userid;//아이디
	private String Passwd;//비밀번호
	private String username;//이름
	private String birth;//생년월일
	private	String email;//이메일
	private String phone;//전화번호
	private String zip;//우편번호
	private	String addr1;//도로명주소
	private String addr2;//상세주소
	private	String gcode;//등급코드
	private int point;//포인트
	private	Date regdate;//가입일자
	private Date modifydate;//수정일자
}
