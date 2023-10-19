<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>bookList</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>TITLE</th>
				<th>AUTHORE</th>
				<th>ISBN</th>
				<th>GENRE</th>
				<th>CREATED_AT</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${fn:length(bookList)==0}">
				<tr>
					<td colspan="6">bookList 값이 없음</td>
				</tr>
			</c:if>
			<c:forEach var="book" items="${bookList }">
				<tr>
					<td>${book.id }</td>
					<td><a href="./getbook.do?id=${book.id }">${book.title}</a></td>
					<td>${book.author }</td>
					<td>${book.isbn }</td>
					<td>${book.genre }</td>
					<td>${book.created_at }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>