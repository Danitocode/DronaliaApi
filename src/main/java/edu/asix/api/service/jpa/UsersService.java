package edu.asix.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.asix.api.entity.User;
import edu.asix.api.repository.UsersRepository;
import edu.asix.api.service.IUsersService;

@Service
public class UsersService implements IUsersService {

	@Autowired
	private UsersRepository repoUsers;
	
	public List<User> buscarTodos() {
		return repoUsers.findAll();
	}

	public void guardar(User user) {
		repoUsers.save(user);
	}
	
	public User recuperar(int idUser) {
		Optional<User> optional = repoUsers.findById(idUser);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public void eliminar(int idUser) {
		repoUsers.deleteById(idUser);
	}

}
