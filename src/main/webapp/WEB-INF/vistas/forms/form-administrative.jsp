<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>

<div class="container mt-3">
	<h1 class="text-center">Formulario Administrativo</h1>

	<div class="row justify-content-center mt-5">
		<div class="col-12 col-md-8 col-lg-6">

			<div class="custom-form-container">
				<form id="form-administrative"
					action="${pageContext.request.contextPath}/create-user"
					method="post">

					<input id="userType" type="hidden" name="userType"
						value="administrative">

					<div>
						<label for="name" class="form-label">Nombre:</label> <input
							type="text" class="form-control" id="name" name="name"
							value="${administrative.name}"> <small
							class="text-danger" id="nameHelp"></small>
					</div>

					<div>
						<label for="dateOfBirth" class="form-label">Fecha de
							nacimiento:</label> <input type="date" class="form-control"
							id="dateOfBirth" name="dateOfBirth"> <small
							class="text-danger" id="dateOfBirthHelp"></small>
					</div>

					<div>
						<label for="run" class="form-label">Run:</label> <input
							type="text" class="form-control" id="run" name="run"
							value="${administrative.run}"> <small class="text-danger"
							id="runHelp"></small>
					</div>

					<div>
						<label for="area" class="form-label">Area:</label> <input
							type="text" class="form-control" id="area" name="area"> <small
							class="text-danger" id="areaHelp"></small>
					</div>

					<div>
						<label for="previousExperience" class="form-label">Experiencia
							previa:</label> <input type="text" class="form-control"
							id="previousExperience" name="previousExperience"> <small
							class="text-danger" id="previousExperienceHelp"></small>
					</div>

					<div class="d-grid gap-2 mt-3 mb-3">
						<button type="submit" class="btn btn-primary">Crear
							Administrativo</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</div>

