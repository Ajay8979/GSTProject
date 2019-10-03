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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custgood_info")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDetailsOfGoods implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custj_id")
	private List<CustomerJwellary> customerJwellary;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "custCloths_id")
	private List<CustomerClothsDetails> customerClothsDetails;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CustomerJwellary> getCustomerJwellary() {
		return customerJwellary;
	}

	public void setCustomerJwellary(List<CustomerJwellary> customerJwellary) {
		this.customerJwellary = customerJwellary;
	}

	public List<CustomerClothsDetails> getCustomerClothsDetails() {
		return customerClothsDetails;
	}

	public void setCustomerClothsDetails(List<CustomerClothsDetails> customerClothsDetails) {
		this.customerClothsDetails = customerClothsDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
