//$(document).ready(function() {
//	function validateForm(typeValue) {
//		const nameValue = $('#name').val();
//		const dateOfBirthValue = $('#dateOfBirth').val();
//		const runValue = $('#run').val();
//
//		let data = {
//			userType: typeValue,
//			name: nameValue,
//			dateOfBirth: dateOfBirthValue,
//			run: runValue
//		};
//
//		switch (typeValue) {
//			case "administrative":
//				data.area = $('#area').val();
//				data.previousExperience = $('#previousExperience').val();
//				break;
//
//			case "client":
//				data.phoneNumber = $('#phoneNumber').val();
//				data.afp = $('#afp').val();
//				data.healthSystem = $('#healthSystem').val();
//				data.address = $('#address').val();
//				data.commune = $('#commune').val();
//				break;
//
//			case "professional":
//				data.title = $('#title').val();
//				data.dateOfBirthIngreso = $('#dateOfBirthIngreso').val();
//				break;
//
//			default:
//				break;
//		}
//
//		const specialCharRegex = /^(?=.*[A-Za-z])[A-Za-zñÑáéíóúÁÉÍÓÚ\s]*$/;
//
//		const errors = {};
//
//		const setValid = (element) => {
//			element.removeClass('is-invalid');
//			element.addClass('is-valid');
//		};
//
//		const setInvalid = (element) => {
//			element.removeClass('is-valid');
//			element.addClass('is-invalid');
//		};
//
//		// ... (el resto del código de validación es el mismo que proporcionaste)
//
//		$.each(errors, function(fieldName, errorMsg) {
//			const helpElem = $(`#${fieldName}Help`);
//			if (errorMsg) {
//				helpElem.text(errorMsg);
//				setInvalid(helpElem.parent().find(`#${fieldName}`));
//			} else {
//				helpElem.text('');
//			}
//		});
//
//		return Object.values(errors).every((errorMsg) => !errorMsg);
//	}
//
//	const typeValue = $('select[name="userType"]').val();
//
//	$(`#form-${typeValue}`).submit(function(event) {
//		event.preventDefault();
//
//		if (validateForm(typeValue)) {
//			console.log("Formulario válido. Enviar datos al servidor...");
//
//
//		} else {
//			console.log("Formulario inválido. Revise los campos antes de enviar.");
//		}
//	});
//});
