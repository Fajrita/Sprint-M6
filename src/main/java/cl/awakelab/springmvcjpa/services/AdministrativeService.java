package cl.awakelab.springmvcjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.springmvcjpa.models.Administrative;
import cl.awakelab.springmvcjpa.repositories.IAdministrativeRepository;

@Service
public class AdministrativeService {

	@Autowired
	private IAdministrativeRepository administrativeRepository;

	public AdministrativeService() {

	}

	public void createAdministrative(Administrative administrative) {
		administrativeRepository.save(administrative);
	}

}
