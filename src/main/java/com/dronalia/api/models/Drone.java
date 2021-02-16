package com.dronalia.api.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="drones")
public class Drone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer axis;
	private Integer size;
	private String colour;
	private Integer price;
	private String name;
	private String img;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	
	public Integer getAxis() {
		return axis;
	}
	public void setAxis(Integer axis) {
		this.axis = axis;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Drone [id=" + id + ", axis=" + axis + ", size=" + size + ", colour=" + colour + ", price=" + price
				+ ", name=" + name +  ", img=" + img +"]";
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	/*
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole tName;
*/
	/*
    @ManyToOne
    @JoinColumn(name="warehouseId", nullable=false)
    private Warehouse warehouse;
	*/
	
/*
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
*/













	
	
}
