package cl.awakelab.springmvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.springmvcjpa.models.Client;

public interface IClientRepository extends JpaRepository<Client, Integer> {

}
