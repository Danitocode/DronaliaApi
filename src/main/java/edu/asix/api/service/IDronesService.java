package edu.asix.api.service;

import java.util.List;

import edu.asix.api.entity.Drone;

public interface IDronesService {

	List<Drone> buscarTodos();
	Drone recuperar (int idDrone);
	void guardar(Drone Drone);
	void eliminar(int idDrone);
}
