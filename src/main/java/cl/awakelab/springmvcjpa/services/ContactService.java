package cl.awakelab.springmvcjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.springmvcjpa.models.Contact;
import cl.awakelab.springmvcjpa.repositories.IContactRepository;

@Service
public class ContactService {

	@Autowired
	private IContactRepository contactRepository;

	public ContactService() {

	}

	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}
}
