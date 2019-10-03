package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customerIndentity_Info")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class CustomerIdentityInformataion implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String designation;
	private String directorIdentificationNumber;
	private String citizenship;
	private String pan;
	private String passportNumber;
	private long adharNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDirectorIdentificationNumber() {
		return directorIdentificationNumber;
	}

	public void setDirectorIdentificationNumber(String directorIdentificationNumber) {
		this.directorIdentificationNumber = directorIdentificationNumber;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}