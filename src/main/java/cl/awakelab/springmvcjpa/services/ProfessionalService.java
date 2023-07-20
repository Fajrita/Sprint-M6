package cl.awakelab.springmvcjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.springmvcjpa.models.Professional;
import cl.awakelab.springmvcjpa.repositories.IProfessionalRepository;

@Service
public class ProfessionalService {

	@Autowired
	private IProfessionalRepository professionalRepository;

	public ProfessionalService() {

	}

	public void createProfessional(Professional professional) {
		professionalRepository.save(professional);
	}

}
