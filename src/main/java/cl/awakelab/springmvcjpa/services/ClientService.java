package cl.awakelab.springmvcjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.springmvcjpa.models.Client;
import cl.awakelab.springmvcjpa.repositories.IClientRepository;

@Service
public class ClientService {

	@Autowired
	private IClientRepository clientRepository;

	public ClientService() {

	}

	public void createClient(Client client) {
		clientRepository.save(client);
	}
}
