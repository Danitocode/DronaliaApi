package edu.asix.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.asix.api.entity.User;
import edu.asix.api.service.IUsersService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UsersController {
	
	@Autowired
	private IUsersService serviceUsers;
	
	@GetMapping("/users")
	public List<User> buscarTodos(){
		return serviceUsers.buscarTodos();
	}
	
	
	@GetMapping("/users/{id}") 
	public User recuperar(@PathVariable("id") int idUser) {
		 User user = serviceUsers.recuperar(idUser);
		 return user;
		
	}
	
	@PostMapping("/users") 
	public User insertar(@RequestBody User user) {
		serviceUsers.guardar(user);
		return user;
	}
	
	@PutMapping("/users")
	public User modificar(@RequestBody User user) {
		serviceUsers.guardar(user);// al pasarle el id, modificará el álbum correspondiente 
		return user;
	} 
	
	@DeleteMapping("/users/{id}")
	public String eliminar(@PathVariable("id") int idUser) {
		serviceUsers.eliminar(idUser);
		return "Registro Eliminado";
	}
}

