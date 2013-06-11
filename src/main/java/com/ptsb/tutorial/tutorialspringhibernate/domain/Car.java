/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Nicholas
 */
@Entity
@Table(name = "CAR")
public class Car extends BaseEntity implements Serializable{

	@Column(name = "OWNER")
	private String owner;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "MANUFACTURER")
	private String manufacturer;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "DATE_MANUFACTURED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateManufactured;

	@OneToMany(mappedBy = "car", orphanRemoval = true, cascade = { CascadeType.ALL })
	private List<Wheel> wheels = new ArrayList<Wheel>();

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_SEQ_CAR")
	@SequenceGenerator(name = "HB_SEQ_CAR", sequenceName = "SEQ_CAR")
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateManufactured() {
		return dateManufactured;
	}

	public void setDateManufactured(Date dateManufactured) {
		this.dateManufactured = dateManufactured;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

}
