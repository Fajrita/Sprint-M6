package cl.awakelab.springmvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.springmvcjpa.models.Professional;

public interface IProfessionalRepository extends JpaRepository<Professional, Integer> {

}
