package cl.awakelab.springmvcjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.springmvcjpa.models.Contact;

public interface IContactRepository extends JpaRepository<Contact, Integer> {

}