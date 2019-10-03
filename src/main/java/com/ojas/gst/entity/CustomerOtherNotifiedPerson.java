package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customerother_notified")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerOtherNotifiedPerson implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String entity;
	private String panEntity;
	private String authorizedSignatory;
	private String pan;
	private String email;
	private Long mobileNo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getPanEntity() {
		return panEntity;
	}
	public void setPanEntity(String panEntity) {
		this.panEntity = panEntity;
	}
	public String getAuthorizedSignatory() {
		return authorizedSignatory;
	}
	public void setAuthorizedSignatory(String authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
