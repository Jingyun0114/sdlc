<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Vendor Entry</title>
		<link rel="stylesheet" href="<c:url value='/css/style.css'/>"/>
	</head> 
	<body>
	<div>
	<img alt="Vendor Entry" src="<c:url value='/images/Logo.jpg'/>">
	</div>
		<div>
			<h2>Vendor Entry</h2>
		</div>
		<div id="form">
			<form:form modelAttribute="vendor" action="vendor">
				<fieldset>
					<legend>Vendor Information</legend>
					<div>
						<label for="vendorName">Vendor Name</label>
						<form:input path="vendorName"/>			
					</div>
					<div>
						<label for="firstName">First Name</label>
						<form:input path="firstName"/>			
					</div>
					<div>
						<label for="lastName">Last Name</label>
						<form:input path="lastName"/>			
					</div>
					<div>
						<label for="address">Address</label>
						<form:input path="address"/>			
					</div>
					<div>
						<label for="city">City</label>
						<form:input path="city"/>			
					</div>
					<div>
						<label for="state">State</label>
						<form:input path="state"/>			
					</div>
					<div>
						<label for="zipCode">Zip Code</label>
						<form:input path="zipCode"/>			
					</div>
					<div>
						<label for="email">Email</label>
						<form:input path="email"/>			
					</div>
					<div>
						<label for="phoneNumber">Phone Number</label>
						<form:input path="phoneNumber"/>			
					</div>
					<div>
						<input type="submit" value="Submit"/>		
					</div>
								
				</fieldset>
			</form:form>
		</div>		
	</body>
</html>
