package com.dronalia.api.jpa;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dronalia.api.models.Drone;
import com.dronalia.api.repository.DroneRepository;
import com.dronalia.api.security.services.IDronesService;

@Service
public class DronesService implements IDronesService {

	@Autowired
	private DroneRepository repoDrones;
	
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
