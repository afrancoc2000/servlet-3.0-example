<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�gina de inicio</title>
</head>
<body>
	<h1>MASCOTAS PREFERIDAS</h1>
	<c:if test="${datos.saludar}">
	<p>Buenos d�as ${datos.usuario} </p>
	</c:if>
	<p>Su mascota es ${datos.nombreMascota} </p>
	<p>y su raza es ${datos.razaMascota} </p>

	<p><a href="mascota.do">Info de ${datos.nombreMascota}</a></p>

</body>
</html>