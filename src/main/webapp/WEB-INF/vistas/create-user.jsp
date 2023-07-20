<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="<core:url value="/res/css/styles.css" />">
</head>

<body>

	<!-- navbar -->
	<jsp:include page="navbar.jsp" />
	<!-- end navbar -->

	<div class="container mt-5">
		<h1 class="text-center">Crear Usuario</h1>
		<div class="form-floating col-10 offset-1 col-md-6 offset-md-3 mt-4"
			id="form-user">
			<select name="userType" class="form-select" id="floatingSelect"
				aria-label="Floating label select example">
				<option selected>Seleccione tipo de usuario</option>
				<option value="administrative">Administrativo</option>
				<option value="client">Cliente</option>
				<option value="professional">Profesional</option>
			</select> <label for="floatingSelect">Tipo de usuario</label>
		</div>

		<div id="form-container"></div>

	</div>

	<!-- 	script bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="<core:url value="/res/js/userFormValidator.js" />"></script>
	<script>
		document.getElementById("floatingSelect").onchange = function() {
			let select = document.getElementById("floatingSelect");
			let selectedValue = select.value;
			let formContainer = document.getElementById("form-container");
			formContainer.innerHTML = "";

			if (selectedValue === "administrative") {
				formContainer.innerHTML = `<jsp:include page="forms/form-administrative.jsp" />`;
			} else if (selectedValue === "client") {
				formContainer.innerHTML = `<jsp:include page="forms/form-client.jsp" />`;
			} else if (selectedValue === "professional") {
				formContainer.innerHTML = `<jsp:include page="forms/form-professional.jsp" />`;
			}
		}
	</script>


</body>
</html>
