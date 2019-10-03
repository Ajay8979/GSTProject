package com.ojas.gst.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "customerReg_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerRegistration implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String email;

	private int otp;

	private String pan;

	private String status_cd;

	private String status;

	private String legalNameOfBusiness;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "taxpayer_id")
	private List<CustomerTaxPayer> taxPayer;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private List<State> state;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "district_id")
	private List<District> district;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "tax_id")
	private CustomerTaxCollector taxCollector;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custgst_id")
	private CustomerGstPractioner cusGstPractioner;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custaxdeduc_id")
	private List<CustomerTaxDeductor> custTaxDeductor;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custUnitedNation_id")
	private List<CustomerUnitedNationBody> cusUnitedNationBody;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custOtherNotified_id")
	private List<CustomerOtherNotifiedPerson> customerOtherNotifiedPersons;

	// @JsonProperty("customerTRN")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private CustomerTRN customerTRN;

	public Long getId() {
		return id;
	}

	public CustomerTRN getCustomerTRN() {
		return customerTRN;
	}

	public void setCustomerTRN(CustomerTRN customerTRN) {
		this.customerTRN = customerTRN;
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

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getStatus_cd() {
		return status_cd;
	}

	public void setStatus_cd(String status_cd) {
		this.status_cd = status_cd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLegalNameOfBusiness() {
		return legalNameOfBusiness;
	}

	public void setLegalNameOfBusiness(String legalNameOfBusiness) {
		this.legalNameOfBusiness = legalNameOfBusiness;
	}

	public List<CustomerTaxPayer> getTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(List<CustomerTaxPayer> taxPayer) {
		this.taxPayer = taxPayer;
	}

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	public List<District> getDistrict() {
		return district;
	}

	public void setDistrict(List<District> district) {
		this.district = district;
	}

	public CustomerTaxCollector getTaxCollector() {
		return taxCollector;
	}

	public void setTaxCollector(CustomerTaxCollector taxCollector) {
		this.taxCollector = taxCollector;
	}

	public CustomerGstPractioner getCusGstPractioner() {
		return cusGstPractioner;
	}

	public void setCusGstPractioner(CustomerGstPractioner cusGstPractioner) {
		this.cusGstPractioner = cusGstPractioner;
	}

	public List<CustomerTaxDeductor> getCustTaxDeductor() {
		return custTaxDeductor;
	}

	public void setCustTaxDeductor(List<CustomerTaxDeductor> custTaxDeductor) {
		this.custTaxDeductor = custTaxDeductor;
	}

	public List<CustomerUnitedNationBody> getCusUnitedNationBody() {
		return cusUnitedNationBody;
	}

	public void setCusUnitedNationBody(List<CustomerUnitedNationBody> cusUnitedNationBody) {
		this.cusUnitedNationBody = cusUnitedNationBody;
	}

	public List<CustomerOtherNotifiedPerson> getCustomerOtherNotifiedPersons() {
		return customerOtherNotifiedPersons;
	}

	public void setCustomerOtherNotifiedPersons(List<CustomerOtherNotifiedPerson> customerOtherNotifiedPersons) {
		this.customerOtherNotifiedPersons = customerOtherNotifiedPersons;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}