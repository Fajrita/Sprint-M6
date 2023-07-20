<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>

<div class="container mt-3">
	<h1 class="text-center">Formulario Profesional</h1>

	<div class="row justify-content-center mt-5">
		<div class="col-12 col-md-8 col-lg-6">

			<div class="custom-form-container">

				<form id="form-professional"
					action="${pageContext.request.contextPath}/create-user"
					method="post">

					<input type="hidden" name="userType" value="professional">

					<div>
						<label for="name" class="form-label">Nombre:</label> <input
							type="text" class="form-control" id="name" name="name"><br>

					</div>

					<div>
						<label for="dateOfBirth" class="form-label">Fecha de
							nacimiento:</label> <input type="date" class="form-control"
							id="dateOfBirth" name="dateOfBirth"><br>
					</div>

					<div>
						<label for="run" class="form-label">Run:</label> <input
							type="text" class="form-control" id="run" name="run"><br>
					</div>

					<div>
						<label for="title" class="form-label">Titulo:</label> <input
							type="text" class="form-control" id="title" name="title"><br>
					</div>

					<div>
						<label for="hireDate" class="form-label">Fecha Ingreso:</label> <input
							type="date" class="form-control" id="hireDate" name="hireDate"
							required><br>
					</div>

					<div class="d-grid gap-2 mt-3 mb-3">

						<button type="submit" class="btn btn-primary">Crear
							Profesional</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</div>