package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "obtail_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ObtainRegistration implements com.ojas.gst.entity.Entity{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ecommerceOperator;
	private String de_Merger;
	private String crossingThreshold;
	private String interStateSupply;
	private String transfer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEcommerceOperator() {
		return ecommerceOperator;
	}
	public void setEcommerceOperator(String ecommerceOperator) {
		this.ecommerceOperator = ecommerceOperator;
	}
	public String getDe_Merger() {
		return de_Merger;
	}
	public void setDe_Merger(String de_Merger) {
		this.de_Merger = de_Merger;
	}
	public String getCrossingThreshold() {
		return crossingThreshold;
	}
	public void setCrossingThreshold(String crossingThreshold) {
		this.crossingThreshold = crossingThreshold;
	}
	public String getInterStateSupply() {
		return interStateSupply;
	}
	public void setInterStateSupply(String interStateSupply) {
		this.interStateSupply = interStateSupply;
	}
	public String getTransfer() {
		return transfer;
	}
	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	
	

}
