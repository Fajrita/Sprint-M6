package cl.awakelab.springmvcjpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.springmvcjpa.models.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

	 List<User> findByUserType(String userType);
}
