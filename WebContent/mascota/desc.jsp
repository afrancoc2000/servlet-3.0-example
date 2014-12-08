<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${mascota.nombre}</title>
</head>
<body>
	<h1>${mascota.nombre}</h1>
	<p>Raza: ${mascota.raza}</p>
	<p>Fecha de nacimiento: <fmt:formatDate value="${mascota.fechaNac.time}" pattern="MM/dd/yyyy" /> </p>
	<p>Colores: ${mascota.colores}</p>
	<p><a href="index.do">Regresar</a></p>
</body>
</html>