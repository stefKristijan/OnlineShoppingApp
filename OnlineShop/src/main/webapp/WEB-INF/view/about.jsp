<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

 <!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>OnlineShop - Home</title>

    <!-- Access the bootstrap Css like this,
		Spring boot will handle the resource mapping automcatically -->
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

	<c:url value="/css/main_style.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />

	<script>
		window.menu='About us';
	</script>

</head>

<body>

   <%@ include file="./common/navbar.jsp" %>
  
  <div class="container">
  
  	<div class="row">
  		<h1>About us</h1>
  	</div>
  
  </div>

   <%@ include file="./common/footer.jsp" %> 
  </body>

</html>
