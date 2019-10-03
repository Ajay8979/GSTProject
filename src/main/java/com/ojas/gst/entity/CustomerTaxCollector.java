package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custtax_collector")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerTaxCollector implements com.ojas.gst.entity.Entity{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String taxCollector;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaxCollector() {
		return taxCollector;
	}
	public void setTaxCollector(String taxCollector) {
		this.taxCollector = taxCollector;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
