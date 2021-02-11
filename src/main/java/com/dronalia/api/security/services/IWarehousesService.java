package com.dronalia.api.security.services;

import java.util.List;

import com.dronalia.api.models.Drone;
import com.dronalia.api.models.Warehouse;

public interface IWarehousesService {

	List<Warehouse> buscarTodos();
	Warehouse recuperar (int idWarehouse);
	void guardar(Warehouse Warehouse);
	void eliminar(int idWarehouse);
	
	/*	@Warehouse//¿Como se puede hacer un método para que me muestre los drones del almacen norte, como un where id_warehouse = 1?
	List<Drone> NorthDrones();*/

}
