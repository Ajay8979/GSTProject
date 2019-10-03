package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "AuthorizedRep_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerAuthorizedRepresentative implements com.ojas.gst.entity.Entity {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;    
    private String authoRep;
    private long enrolmentId;
    private String cName;
    private String cMiddleNmae;
    private String xLasName;
    private String designation;
    private long phoneNumber;
    private String  emailId;
    private Long panNo;
    private Long adharNo;
    private Long telephoneNo;
    private Long faxNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthoRep() {
		return authoRep;
	}
	public void setAuthoRep(String authoRep) {
		this.authoRep = authoRep;
	}
	public long getEnrolmentId() {
		return enrolmentId;
	}
	public void setEnrolmentId(long enrolmentId) {
		this.enrolmentId = enrolmentId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcMiddleNmae() {
		return cMiddleNmae;
	}
	public void setcMiddleNmae(String cMiddleNmae) {
		this.cMiddleNmae = cMiddleNmae;
	}
	public String getxLasName() {
		return xLasName;
	}
	public void setxLasName(String xLasName) {
		this.xLasName = xLasName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getPanNo() {
		return panNo;
	}
	public void setPanNo(Long panNo) {
		this.panNo = panNo;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public Long getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(Long telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public Long getFaxNo() {
		return faxNo;
	}
	public void setFaxNo(Long faxNo) {
		this.faxNo = faxNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}