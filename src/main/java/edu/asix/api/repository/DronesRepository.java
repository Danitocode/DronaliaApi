package edu.asix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.asix.api.entity.Drone;

public interface DronesRepository extends JpaRepository<Drone, Integer> {

}
