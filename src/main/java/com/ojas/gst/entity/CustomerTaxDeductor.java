package com.ojas.gst.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "customertax_deductor")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerTaxDeductor implements com.ojas.gst.entity.Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String taxDeductor;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "acct_id")
	private CustomerAccount customerAccount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaxDeductor() {
		return taxDeductor;
	}

	public void setTaxDeductor(String taxDeductor) {
		this.taxDeductor = taxDeductor;
	}

	public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

}
