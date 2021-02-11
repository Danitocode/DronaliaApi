package com.dronalia.api.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "warehouses")
public class Warehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 100)
	private String name;

	@NotBlank
	@Size(max = 100)
	private String address;

/*
    @OneToMany(mappedBy="warehouses")
    private Set<Drone> drones;

	*/
	
	
	public Warehouse() {
	}




	public Warehouse(String name, @NotBlank @Size(max = 100) String address) {
		super();
		this.name = name;
		this.address = address;
	}




	public Warehouse(@NotBlank @Size(max = 100) String name, @NotBlank @Size(max = 100) String address,
			Set<Role> roles) {
		super();
		this.name = name;
		this.address = address;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}



/*
	public Set<Drone> getDrones() {
		return drones;
	}




	public void setDrones(Set<Drone> drones) {
		this.drones = drones;
	}

*/


	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", name=" + name + ", address=" + address + ", drones="  + "]";
	}









}
