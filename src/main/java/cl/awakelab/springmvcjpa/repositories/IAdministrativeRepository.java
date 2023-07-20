package cl.awakelab.springmvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.springmvcjpa.models.Administrative;

public interface IAdministrativeRepository extends JpaRepository<Administrative, Integer> {

}
