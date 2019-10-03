package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custTrn")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerTRN implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = -6172382615646686309L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String trnNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrnNo() {
		return trnNo;
	}

	public void setTrnNo(String trnNo) {
		this.trnNo = trnNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
