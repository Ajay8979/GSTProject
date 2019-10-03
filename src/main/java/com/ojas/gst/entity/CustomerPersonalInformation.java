package com.ojas.gst.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customerPersonal_info")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerPersonalInformation implements com.ojas.gst.entity.Entity {

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String personFirstName;
private String personMiddleName;
private String personLastName;

private String fatherFirstName;
private String fatherMiddleName;
private String fattherLastName;

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
private Date dateOfBirth;

private long mobileNo;
private String emailId;
private long telePhoneNo;

	/*
	 * @Lob private byte[] image;
	 */

@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "gender_id")
private List<CustomerGender> gender;

@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
// @JoinColumn(name = "identi_id")
private CustomerIdentityInformataion identityInformtion;

@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "addres_id")
private List<CustomerResidentialAddress> residentialAddress;

	/*
	 * @OneToOne(cascade = c) private CustomerDocument customerDocument;
	 */
	/*
	 * public CustomerDocument getCustomerDocument() { return customerDocument; }
	 * 
	 * public void setCustomerDocument(CustomerDocument customerDocument) {
	 * this.customerDocument = customerDocument; }
	 */

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getPersonFirstName() {
	return personFirstName;
}

public void setPersonFirstName(String personFirstName) {
	this.personFirstName = personFirstName;
}

public String getPersonMiddleName() {
	return personMiddleName;
}

public void setPersonMiddleName(String personMiddleName) {
	this.personMiddleName = personMiddleName;
}

public String getPersonLastName() {
	return personLastName;
}

public void setPersonLastName(String personLastName) {
	this.personLastName = personLastName;
}

public String getFatherFirstName() {
	return fatherFirstName;
}

public void setFatherFirstName(String fatherFirstName) {
	this.fatherFirstName = fatherFirstName;
}

public String getFatherMiddleName() {
	return fatherMiddleName;
}

public void setFatherMiddleName(String fatherMiddleName) {
	this.fatherMiddleName = fatherMiddleName;
}

public String getFattherLastName() {
	return fattherLastName;
}

public void setFattherLastName(String fattherLastName) {
	this.fattherLastName = fattherLastName;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public long getMobileNo() {
	return mobileNo;
}

public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public List<CustomerGender> getGender() {
	return gender;
}

public void setGender(List<CustomerGender> gender) {
	this.gender = gender;
}

public long getTelePhoneNo() {
	return telePhoneNo;
}

public void setTelePhoneNo(long telePhoneNo) {
	this.telePhoneNo = telePhoneNo;
}

public CustomerIdentityInformataion getIdentityInformtion() {
	return identityInformtion;
}

public void setIdentityInformtion(CustomerIdentityInformataion identityInformtion) {
	this.identityInformtion = identityInformtion;
}

public List<CustomerResidentialAddress> getResidentialAddress() {
	return residentialAddress;
}

public void setResidentialAddress(List<CustomerResidentialAddress> residentialAddress) {
	this.residentialAddress = residentialAddress;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}




}