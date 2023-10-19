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
	<h1>bookInfo</h1>
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
				<tr>
					<td>${bookInfo.id }</td>
					<td>${bookInfo.title }</td>
					<td>${bookInfo.author }</td>
					<td>${bookInfo.isbn }</td>
					<td>${bookInfo.genre }</td>
					<td>${bookInfo.created_at }</td>
				</tr>
		</tbody>
	</table>
</body>
</html>