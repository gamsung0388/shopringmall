<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매폼</title>
<script type="text/javascript">

</script>
</head>
<body>
	<h2>장바구니</h2>
	${product}
	${grade}
	${userid}
	
	
	<table border="1">
		<tr>
			<th>체크</th>
			<th>상품정보</th>
			<th>판매가</th>
			<th>수량</th>
			<th>적립/할인</th>
			<th>배송비</th>
			<th>합계</th>
			<th>선택</th>
		</tr>
		
		
		<tr>
			<td><input type="checkbox" name="chk" value=""></td>
			<td>${product.pname} <br>${product.pmaker}<br>${product.psize}</td>
			<td>${product.price}</td>
			<td>cnt</td>	
			<td>5p/${grade.discount}</td>
			<td>+5000</td>
			<td>5*${product.price}</td>
			<td><button>주문</button><br><button>삭제</button></td>
		</tr>
		
	
	
	
	</table>
</body>
</html>