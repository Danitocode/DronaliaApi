package com.dronalia.api.jpa;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dronalia.api.models.Warehouse;
import com.dronalia.api.repository.WarehouseRepository;
import com.dronalia.api.security.services.IWarehousesService;
import com.dronalia.api.security.services.IWarehousesService;

@Service
public class WarehousesService implements IWarehousesService {

	@Autowired
	private WarehouseRepository repoWarehouses;
	
	public List<Warehouse> buscarTodos() {
		return repoWarehouses.findAll();
	}

	public void guardar(Warehouse warehouse) {
		repoWarehouses.save(warehouse);
	}
	
	public Warehouse recuperar(int idWarehouse) {
		Optional<Warehouse> optional = repoWarehouses.findById(idWarehouse);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public void eliminar(int idWarehouse) {
		repoWarehouses.deleteById(idWarehouse);
	}

}
