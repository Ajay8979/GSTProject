package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "custContact_info")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerContactInfo implements com.ojas.gst.entity.Entity {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private Long telephoneno;
	private Long mobileno;
	private String faxno;
	private boolean addionalBusiness;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelephoneno() {
		return telephoneno;
	}
	public void setTelephoneno(Long telephoneno) {
		this.telephoneno = telephoneno;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getFaxno() {
		return faxno;
	}
	public void setFaxno(String faxno) {
		this.faxno = faxno;
	}
	public boolean isAddionalBusiness() {
		return addionalBusiness;
	}
	public void setAddionalBusiness(boolean addionalBusiness) {
		this.addionalBusiness = addionalBusiness;
	}
	

}
