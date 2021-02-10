package edu.asix.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.asix.api.entity.Drone;
import edu.asix.api.repository.DronesRepository;
import edu.asix.api.service.IDronesService;

@Service
public class DronesService implements IDronesService {

	@Autowired
	private DronesRepository repoDrones;
	
	public List<Drone> buscarTodos() {
		return repoDrones.findAll();
	}

	public void guardar(Drone drone) {
		repoDrones.save(drone);
	}
	
	public Drone recuperar(int idDrone) {
		Optional<Drone> optional = repoDrones.findById(idDrone);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public void eliminar(int idDrone) {
		repoDrones.deleteById(idDrone);
	}

}
