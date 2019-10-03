package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custCloths_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerClothsDetails implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    private String jeans;
    private String shirts;
    private String tshirts;
    private String casualPants;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getJeans() {
		return jeans;
	}
	public void setJeans(String jeans) {
		this.jeans = jeans;
	}
	public String getShirts() {
		return shirts;
	}
	public void setShirts(String shirts) {
		this.shirts = shirts;
	}
	public String getTshirts() {
		return tshirts;
	}
	public void setTshirts(String tshirts) {
		this.tshirts = tshirts;
	}
	public String getCasualPants() {
		return casualPants;
	}
	public void setCasualPants(String casualPants) {
		this.casualPants = casualPants;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
