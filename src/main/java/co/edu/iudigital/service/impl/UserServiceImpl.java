package co.edu.iudigital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.entity.Users;
import co.edu.iudigital.model.repository.UsersRepository;
import co.edu.iudigital.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsersRepository userRepository;

	@Override
	public void create(Users user) {
		// TODO: implementar
		
	}

	@Override
	public Users login(Users user) throws Exception {
		
		Users existsUser = userRepository
			      .findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(existsUser == null) {
			throw new Exception("Usuario o contraseña invalido!");
		}
	     return existsUser;
	}

}
