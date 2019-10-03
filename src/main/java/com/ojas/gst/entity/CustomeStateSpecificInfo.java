package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custState_Info")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomeStateSpecificInfo implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String taxEmpCodeNo;
	private String regCertificateNo;
	private String linsenceNo;
	public String getLinsenceNo() {
		return linsenceNo;
	}
	public void setLinsenceNo(String linsenceNo) {
		this.linsenceNo = linsenceNo;
	}
	private String nameInLinsence;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaxEmpCodeNo() {
		return taxEmpCodeNo;
	}
	public void setTaxEmpCodeNo(String taxEmpCodeNo) {
		this.taxEmpCodeNo = taxEmpCodeNo;
	}
	public String getRegCertificateNo() {
		return regCertificateNo;
	}
	public void setRegCertificateNo(String regCertificateNo) {
		this.regCertificateNo = regCertificateNo;
	}
	
	public String getNameInLinsence() {
		return nameInLinsence;
	}
	public void setNameInLinsence(String nameInLinsence) {
		this.nameInLinsence = nameInLinsence;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
