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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customerPersonal_Info")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerPersonalInfo implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cName;
	private String cMiddleName;
	private String cLastName;
	private String cfatherName;
	private String cfathermiddlename;
	private String cfatherlastname;
	
	/*
	 * @Enumerated(EnumType.ORDINAL) private Gender gender1;
	 */
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Date dob;
	private Long mobileNo;
	private String emailAddress;
	private String gender;
	private Long telePhoneNo;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cust_id")
	private List<CustomerIdentityInfo> cusidentityinfo;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cresidential_id")
	private List<CustomerResidentailAddress> cResidentailAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcMiddleName() {
		return cMiddleName;
	}

	public void setcMiddleName(String cMiddleName) {
		this.cMiddleName = cMiddleName;
	}

	public String getcLastName() {
		return cLastName;
	}

	public void setcLastName(String cLastName) {
		this.cLastName = cLastName;
	}

	public String getCfatherName() {
		return cfatherName;
	}

	public void setCfatherName(String cfatherName) {
		this.cfatherName = cfatherName;
	}

	public String getCfathermiddlename() {
		return cfathermiddlename;
	}

	public void setCfathermiddlename(String cfathermiddlename) {
		this.cfathermiddlename = cfathermiddlename;
	}

	public String getCfatherlastname() {
		return cfatherlastname;
	}

	public void setCfatherlastname(String cfatherlastname) {
		this.cfatherlastname = cfatherlastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getGender() {
		return gender;
	}

	public Long getTelePhoneNo() {
		return telePhoneNo;
	}

	public void setTelePhoneNo(Long telePhoneNo) {
		this.telePhoneNo = telePhoneNo;
	}

	public List<CustomerIdentityInfo> getCusidentityinfo() {
		return cusidentityinfo;
	}

	public void setCusidentityinfo(List<CustomerIdentityInfo> cusidentityinfo) {
		this.cusidentityinfo = cusidentityinfo;
	}

	public List<CustomerResidentailAddress> getcResidentailAddress() {
		return cResidentailAddress;
	}

	public void setcResidentailAddress(List<CustomerResidentailAddress> cResidentailAddress) {
		this.cResidentailAddress = cResidentailAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
