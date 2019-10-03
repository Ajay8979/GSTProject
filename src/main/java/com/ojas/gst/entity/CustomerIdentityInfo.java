package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custIdentity_info")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerIdentityInfo implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String designation;
	private Long idtentificationNo;
	private String cityzen;
	
	
	public String getCityzen() {
		return cityzen;
	}

	public void setCityzen(String cityzen) {
		this.cityzen = cityzen;
	}

	private String pan;
	private Long passportno;
	private Long adharno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getIdtentificationNo() {
		return idtentificationNo;
	}

	public void setIdtentificationNo(Long idtentificationNo) {
		this.idtentificationNo = idtentificationNo;
	}

	

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Long getPassportno() {
		return passportno;
	}

	public void setPassportno(Long passportno) {
		this.passportno = passportno;
	}

	public Long getAdharno() {
		return adharno;
	}

	public void setAdharno(Long adharno) {
		this.adharno = adharno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
