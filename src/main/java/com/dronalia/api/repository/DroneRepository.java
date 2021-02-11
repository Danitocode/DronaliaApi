package com.dronalia.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dronalia.api.models.Drone;

public interface DroneRepository extends JpaRepository<Drone, Integer> {

}
