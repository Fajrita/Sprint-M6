package cl.awakelab.springmvcjpa.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.springmvcjpa.models.Contact;
import cl.awakelab.springmvcjpa.services.ContactService;

@Controller
public class ContactController {

	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
	private static final Logger auditLogger = LoggerFactory.getLogger("auditLogger");
	private static final Logger debugLogger = LoggerFactory.getLogger("debugLogger");

	@Autowired
	private ContactService contactService;

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showContactForm(Model model) {
		logger.info("Showing create form for contact");
		model.addAttribute("contact", new Contact());
		return "contact";
	}

	@RequestMapping(path = "/contact", method = RequestMethod.POST)
	public String submitContactForm(Contact contact) {
		contactService.saveContact(contact);
		logger.info("Contact form submitted");
		auditLogger.info("Contact form submitted by user: {}", contact.getName());
		debugLogger.debug("Submitted contact details: {}", contact);
		return "contact";
	}

}