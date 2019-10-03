package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cust_account")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerAccount implements com.ojas.gst.entity.Entity{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO ) 
	private Long id;
	
	private Long permanentAccounntno;
	private Long deductorAccoutnno;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPermanentAccounntno() {
		return permanentAccounntno;
	}
	public void setPermanentAccounntno(Long permanentAccounntno) {
		this.permanentAccounntno = permanentAccounntno;
	}
	public Long getDeductorAccoutnno() {
		return deductorAccoutnno;
	}
	public void setDeductorAccoutnno(Long deductorAccoutnno) {
		this.deductorAccoutnno = deductorAccoutnno;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	

}
