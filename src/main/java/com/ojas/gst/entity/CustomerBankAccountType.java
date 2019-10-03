package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custBankAcc_type")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerBankAccountType implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String acctype1;
	private String acctype2;
	private String acctype3;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAcctype1() {
		return acctype1;
	}
	public void setAcctype1(String acctype1) {
		this.acctype1 = acctype1;
	}
	public String getAcctype2() {
		return acctype2;
	}
	public void setAcctype2(String acctype2) {
		this.acctype2 = acctype2;
	}
	public String getAcctype3() {
		return acctype3;
	}
	public void setAcctype3(String acctype3) {
		this.acctype3 = acctype3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
