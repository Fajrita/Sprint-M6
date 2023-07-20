package cl.awakelab.springmvcjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.awakelab.springmvcjpa.models.Administrative;
import cl.awakelab.springmvcjpa.models.Client;
import cl.awakelab.springmvcjpa.models.Professional;
import cl.awakelab.springmvcjpa.models.User;
import cl.awakelab.springmvcjpa.services.AdministrativeService;
import cl.awakelab.springmvcjpa.services.ClientService;
import cl.awakelab.springmvcjpa.services.ProfessionalService;
import cl.awakelab.springmvcjpa.services.UserService;

@Controller
public class UserController {

	public UserController() {

	}

	@Autowired
	UserService userService;

	@Autowired
	AdministrativeService administrativeService;

	@Autowired
	ClientService clientService;

	@Autowired
	ProfessionalService professionalService;

	@GetMapping("/list-users")
	public String showListUserView(Model model) {
		model.addAttribute("cliente", new Client());
		model.addAttribute("administrative", new Administrative());
		model.addAttribute("professional", new Professional());
		return "list-users";
	}

	@PostMapping("/list-users")
	@ResponseBody
	public ResponseEntity<List<User>> getUsersByType(@RequestParam("userType") String userType) {
		List<User> users = userService.getUsersByType(userType);
		return ResponseEntity.ok(users);
	}

	@GetMapping("/create-user")
	public String showCreateUserForm(Model model) {
		model.addAttribute("cliente", new Client());
		model.addAttribute("administrative", new Administrative());
		model.addAttribute("professional", new Professional());
		return "create-user";
	}

	@PostMapping("/create-user")
	public String createUser(@RequestParam("userType") String userType, @ModelAttribute("client") Client client,
			@ModelAttribute("administrative") Administrative administrative,
			@ModelAttribute("professional") Professional professional) {

		switch (userType) {
		case "client":
			clientService.createClient(client);
			break;

		case "administrative":
			System.out.println(administrative);
			administrativeService.createAdministrative(administrative);
			break;

		case "professional":
			professionalService.createProfessional(professional);
			break;

		default:

			break;
		}

		return "redirect:/create-user";
	}
}
