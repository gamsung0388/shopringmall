package org.spring.my.dto;

import lombok.Data;

@Data
public class SellDetail {//판매상세테이블
	private String scode;//주문코드
	private String pcode;//상품코드
	private int salecnt;//주문수량
	private int amount;//주문금액
}
