package com.dronalia.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dronalia.api.models.Drone;
import com.dronalia.api.models.Warehouse;
import com.dronalia.api.security.services.IDronesService;
import com.dronalia.api.security.services.IWarehousesService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	
	
	@Autowired
	private IDronesService serviceDrones;
	
	

	@GetMapping("/drones")
	public List<Drone> buscarTodos(){
		return serviceDrones.buscarTodos();
	}
	
	
	@GetMapping("/drones/{id}") 
	public Drone recuperar(@PathVariable("id") int idDrone) {
		 Drone drone = serviceDrones.recuperar(idDrone);
		 return drone;
		
	}
	
	@PostMapping("/drones") 
	public Drone insertar(@RequestBody Drone drone) {
		serviceDrones.guardar(drone);
		return drone;
	}
	
	@PutMapping("/drones")
	public Drone modificar(@RequestBody Drone drone) {
		serviceDrones.guardar(drone);// al pasarle el id, modificará el álbum correspondiente 
		return drone;
	} 
	
	@DeleteMapping("/drones/{id}")
	public String eliminar(@PathVariable("id") int idDrone) {
		serviceDrones.eliminar(idDrone);
		return "Registro Eliminado";
	}
	
	@Autowired
	private IWarehousesService serviceWarehouses;
	
	

	@GetMapping("/warehouses")
	public List<Warehouse> listAllWarehouses(){
		return serviceWarehouses.buscarTodos();
	}

	
}
