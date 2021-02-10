package edu.asix.api.service;

import java.util.List;


import edu.asix.api.entity.User;

public interface IUsersService {

	List<User> buscarTodos();
	User recuperar (int idUser);
	void guardar(User User);
	void eliminar(int idUser);
}
