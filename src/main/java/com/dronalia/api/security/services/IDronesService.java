package com.dronalia.api.security.services;

import java.util.List;

import com.dronalia.api.models.Drone;

public interface IDronesService {

	List<Drone> buscarTodos();
	Drone recuperar (int idDrone);
	void guardar(Drone Drone);
	void eliminar(int idDrone);
	
	/*	@Warehouse//¿Como se puede hacer un método para que me muestre los drones del almacen norte, como un where id_warehouse = 1?
	List<Drone> NorthDrones();*/

}
