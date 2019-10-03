
package com.ojas.gst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customer_img")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDocument implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;

	@Id

	@GeneratedValue

	@Column(name = "id")
	private Integer id;

	@Lob
	private byte[] image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
