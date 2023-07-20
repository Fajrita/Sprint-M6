<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>

<div class="container mt-3">
	<h1 class="text-center">Formulario Cliente</h1>

	<div class="row justify-content-center mt-5">
		<div class="col-12 col-md-8 col-lg-6">

			<div class="custom-form-container">

				<form id="form-client"
					action="${pageContext.request.contextPath}/create-user"
					method="post">

					<input type="hidden" name="userType" value="client">

					<div>
						<label for="name" class="form-label">Nombre:</label> <input
							type="text" class="form-control" id="name" name="name">

					</div>

					<div>
						<label for="dateOfBirth" class="form-label">Fecha de
							creacion:</label> <input type="date" class="form-control"
							id="dateOfBirth" name="dateOfBirth">
					</div>

					<div>
						<label for="run" class="form-label">Run:</label> <input
							type="text" class="form-control" id="run" name="run">
					</div>

					<div>
						<label for="phoneNumber" class="form-label">Telefono:</label> <input
							type="text" class="form-control" id="phoneNumber"
							name="phoneNumber">
					</div>

					<div>
						<label for="afp" class="form-label">AFP:</label> <input
							type="text" class="form-control" id="afp" name="afp">
					</div>

					<div>
						<label for="healthSystem" class="form-label">Sistema de
							salud (1: Fonasa, 2: Isapre):</label> <input type="text"
							class="form-control" id="healthSystem" name="healthSystem">
					</div>

					<div>
						<label for="address" class="form-label">Direccion:</label> <input
							type="text" class="form-control" id="address" name="address">
					</div>

					<div>
						<label for="commune" class="form-label">Comuna:</label> <input
							type="text" class="form-control" id="commune" name="commune">
					</div>

					<div class="d-grid gap-2 mt-3 mb-3">

						<button type="submit" class="btn btn-primary">Crear
							Cliente</button>

					</div>

				</form>
			</div>
		</div>
	</div>
</div>