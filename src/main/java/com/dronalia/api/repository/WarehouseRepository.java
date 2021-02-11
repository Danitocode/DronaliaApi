package com.dronalia.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dronalia.api.models.Drone;
import com.dronalia.api.models.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

}
