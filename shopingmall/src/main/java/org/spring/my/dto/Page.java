package org.spring.my.dto;

import lombok.Data;

@Data
public class Page {//페이징처리
	private int curpage; //현재페이지
	private int totpage; // 전체페이지수
	private int perpage=10; //한페이지당 게시물수
	private int startno;  //시작번호
	private int endno; 	//끝번호
	
	private int perblock=10; //페이지 블럭의 수
	private int startpage;   //블럭의 시작페이지
	private int endpage; //블럭의 끝 페이지
	
	private String findkey; //검색키
	private String findvalue; //검색값
}
