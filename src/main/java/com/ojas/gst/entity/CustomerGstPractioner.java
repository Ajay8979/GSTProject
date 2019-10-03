package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "cust_practioner")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerGstPractioner implements com.ojas.gst.entity.Entity {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String gstPractioner;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGstPractioner() {
		return gstPractioner;
	}
	public void setGstPractioner(String gstPractioner) {
		this.gstPractioner = gstPractioner;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
