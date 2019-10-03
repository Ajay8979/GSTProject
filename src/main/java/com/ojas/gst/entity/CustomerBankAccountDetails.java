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

@Entity
@Table(name = "custBank_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerBankAccountDetails implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long bankAccountNumber;

	private String ifscCode;

	private String bankName;

	private String bankAddress;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custAcc_type")
	private List<CustomerBankAccountType> customerBankAccountType;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custdoc_id")
	private CustomerDocumentsDetails customerDocumentsDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public List<CustomerBankAccountType> getCustomerBankAccountType() {
		return customerBankAccountType;
	}

	public void setCustomerBankAccountType(List<CustomerBankAccountType> customerBankAccountType) {
		this.customerBankAccountType = customerBankAccountType;
	}

	public CustomerDocumentsDetails getCustomerDocumentsDetails() {
		return customerDocumentsDetails;
	}

	public void setCustomerDocumentsDetails(CustomerDocumentsDetails customerDocumentsDetails) {
		this.customerDocumentsDetails = customerDocumentsDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
