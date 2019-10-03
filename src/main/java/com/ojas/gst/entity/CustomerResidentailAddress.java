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
@Table(name = "customrResidential_Address")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerResidentailAddress implements com.ojas.gst.entity.Entity{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String buildingno;
	private int floorno;
	private String buildingname;
	private String street;
	private String city;
	private String country;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private List<State> state;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "district_id")
	private List<District> district;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBuildingno() {
		return buildingno;
	}
	public void setBuildingno(String buildingno) {
		this.buildingno = buildingno;
	}
	public int getFloorno() {
		return floorno;
	}
	public void setFloorno(int floorno) {
		this.floorno = floorno;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
