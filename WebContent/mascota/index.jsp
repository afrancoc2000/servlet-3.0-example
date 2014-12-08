<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mascotas preferidas</title>
</head>
<body>
	<h1>MIS MASCOTAS PREFERIDAS</h1>

	<c:forEach var="mascota" items="${mascotas}" >
		<p><a href="desc.do?id=${mascota.id}"> ${mascota.nombre}</a></p>
	</c:forEach>

</body>
</html>