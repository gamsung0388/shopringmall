package org.spring.my.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Notice {//공지
	private String ncode;//게시글코드
	private String userid;//아이디
	private String subject;//제목
	private String content;//내용
	private int readcnt;//조회수
	private String ip;//아이피
	private Date regdate;//등록일자
	private Date modifydate;//수정일자
}
