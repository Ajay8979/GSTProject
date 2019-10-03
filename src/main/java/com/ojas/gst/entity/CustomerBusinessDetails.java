
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
@Table(name = "custBusiness_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerBusinessDetails implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tradeName;
	private String stateJurisdiction;
	private boolean taxablePerson;
	private boolean composition;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Date dateOfCommenceOfBusiness;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Date liabilityToRegisAraise;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custBus_id")
	private List<CustomerConstitutionBusiness> ccb;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "satate_id")
	private List<State> state;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "dist_id")
	private List<District> dist;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "obtainreg_id")
	private List<ObtainRegistration> obtainRegistration;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "div_id")
	private List<CustomerDivision> customerDivision;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cusrangeofcode_id")
	private List<CustomerRangeOfCode> customerRangeOfCodes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getStateJurisdiction() {
		return stateJurisdiction;
	}

	public void setStateJurisdiction(String stateJurisdiction) {
		this.stateJurisdiction = stateJurisdiction;
	}

	public boolean isTaxablePerson() {
		return taxablePerson;
	}

	public void setTaxablePerson(boolean taxablePerson) {
		this.taxablePerson = taxablePerson;
	}

	public boolean isComposition() {
		return composition;
	}

	public void setComposition(boolean composition) {
		this.composition = composition;
	}

	public Date getDateOfCommenceOfBusiness() {
		return dateOfCommenceOfBusiness;
	}

	public void setDateOfCommenceOfBusiness(Date dateOfCommenceOfBusiness) {
		this.dateOfCommenceOfBusiness = dateOfCommenceOfBusiness;
	}

	public Date getLiabilityToRegisAraise() {
		return liabilityToRegisAraise;
	}

	public void setLiabilityToRegisAraise(Date liabilityToRegisAraise) {
		this.liabilityToRegisAraise = liabilityToRegisAraise;
	}

	public List<CustomerConstitutionBusiness> getCcb() {
		return ccb;
	}

	public void setCcb(List<CustomerConstitutionBusiness> ccb) {
		this.ccb = ccb;
	}

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	public List<District> getDist() {
		return dist;
	}

	public void setDist(List<District> dist) {
		this.dist = dist;
	}

	public List<ObtainRegistration> getObtainRegistration() {
		return obtainRegistration;
	}

	public void setObtainRegistration(List<ObtainRegistration> obtainRegistration) {
		this.obtainRegistration = obtainRegistration;
	}

	public List<CustomerDivision> getCustomerDivision() {
		return customerDivision;
	}

	public void setCustomerDivision(List<CustomerDivision> customerDivision) {
		this.customerDivision = customerDivision;
	}

	public List<CustomerRangeOfCode> getCustomerRangeOfCodes() {
		return customerRangeOfCodes;
	}

	public void setCustomerRangeOfCodes(List<CustomerRangeOfCode> customerRangeOfCodes) {
		this.customerRangeOfCodes = customerRangeOfCodes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
