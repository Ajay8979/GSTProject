package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Gender_details")


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class CustomerGender implements com.ojas.gst.entity.Entity {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private static final long serialVersionUID = 1L;
private String gen1;
private String gen2;
private String gen3;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGen1() {
	return gen1;
}
public void setGen1(String gen1) {
	this.gen1 = gen1;
}
public String getGen2() {
	return gen2;
}
public void setGen2(String gen2) {
	this.gen2 = gen2;
}
public String getGen3() {
	return gen3;
}
public void setGen3(String gen3) {
	this.gen3 = gen3;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
