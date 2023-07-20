package cl.awakelab.springmvcjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.springmvcjpa.models.User;
import cl.awakelab.springmvcjpa.repositories.IUserRepository;

@Service
public class UserService {

	@Autowired
	private IUserRepository userRepository;

	public UserService() {

	}

	public List<User> getUsersByType(String userType) {

		return userRepository.findByUserType(userType);
	}
}
