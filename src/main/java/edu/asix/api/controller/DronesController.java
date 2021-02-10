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

import edu.asix.api.entity.Drone;
import edu.asix.api.service.IDronesService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DronesController {
	
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
}
