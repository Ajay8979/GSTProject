package com.ojas.gst.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customerResidential_Add")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerResidentialAddress implements com.ojas.gst.entity.Entity {
/**
 * 
 */
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String flatNo;
private int floorNo;
private String nameOfBuilding;
private String street;
private String village;
private String country;

@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "state_id")
private List<State> state;

@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "district_id")
private List<District> district;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFlatNo() {
	return flatNo;
}

public void setFlatNo(String flatNo) {
	this.flatNo = flatNo;
}

public int getFloorNo() {
	return floorNo;
}

public void setFloorNo(int floorNo) {
	this.floorNo = floorNo;
}

public String getNameOfBuilding() {
	return nameOfBuilding;
}

public void setNameOfBuilding(String nameOfBuilding) {
	this.nameOfBuilding = nameOfBuilding;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getVillage() {
	return village;
}

public void setVillage(String village) {
	this.village = village;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public List<State> getState() {
	return state;
}

public void setState(List<State> state) {
	this.state = state;
}

public List<District> getDistrict() {
	return district;
}

public void setDistrict(List<District> district) {
	this.district = district;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}






}
