package org.spring.my.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Review {//상품 리뷰/평점 테이블
	private String rcode;//리뷰코드
	private String pcode;//상품코드
	private String userid;//아이디
	private String content;//리뷰내용
	private int score;//평점
	private Date regdate;//등록일자
	private Date modifydate;//수정일자
}
