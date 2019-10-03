package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custAddiplace_busi")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerAdditionalPlaceOfBusiness implements com.ojas.gst.entity.Entity{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int addtionPlaceOfBus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAddtionPlaceOfBus() {
		return addtionPlaceOfBus;
	}

	public void setAddtionPlaceOfBus(int addtionPlaceOfBus) {
		this.addtionPlaceOfBus = addtionPlaceOfBus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
