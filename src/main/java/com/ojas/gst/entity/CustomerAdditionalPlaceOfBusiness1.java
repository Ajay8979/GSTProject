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
@Table(name = "custAddiplace_busi1")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerAdditionalPlaceOfBusiness1 implements com.ojas.gst.entity.Entity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String buildingno;
	private String floorno;
	private String buildingname;
	private String street;
	private String town;
	private Long pincode;
	private double latitude;
	private double longitude;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="dist_id")
	private List<District> dist;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="contact_id")
	private List<CustomerContactInfo> customerContactInfos;

    private String reason;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Date date;	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBuildingno() {
		return buildingno;
	}
	public void setBuildingno(String buildingno) {
		this.buildingno = buildingno;
	}
	public String getFloorno() {
		return floorno;
	}
	public void setFloorno(String floorno) {
		this.floorno = floorno;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public List<District> getDist() {
		return dist;
	}
	public void setDist(List<District> dist) {
		this.dist = dist;
	}
	public List<CustomerContactInfo> getCustomerContactInfos() {
		return customerContactInfos;
	}
	public void setCustomerContactInfos(List<CustomerContactInfo> customerContactInfos) {
		this.customerContactInfos = customerContactInfos;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
