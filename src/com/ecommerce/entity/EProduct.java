package com.ecommerce.entity;

import java.util.Date;

public class EProduct {

	// properties
	private int id;
	private String name;
	private Double price;
	private Date createdAt;
	private Date modifiedAt;

	// default & parameterized constructor
	public EProduct(String name, Double price) {
		this.name = name;
		this.price = price;
		this.createdAt = new Date();
		this.modifiedAt = new Date();
	}

	// default & parameterized constructor
	public EProduct(int id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.createdAt = new Date();
		this.modifiedAt = new Date();
	}

	// default & parameterized constructor
	public EProduct(int id) {
		this.id = id;
	}

	public EProduct() {
	}

	// get and set methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
