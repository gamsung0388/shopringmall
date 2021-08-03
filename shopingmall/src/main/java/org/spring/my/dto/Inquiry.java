package org.spring.my.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Inquiry {//문의
	private String icode;//문의글코드
	private String userid;//아이디
	private String subject;//제목
	private String content;//내용
	private int istep;//글순서
	private int ilevel;//글레벨
	private int readcnt;//조회수
	private String ip;//아이피
	private Date regdate;//등록일자
	private Date modifydate;//수정일자
	
}
