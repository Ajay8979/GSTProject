
package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "image_store")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerImage implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private byte[] uploadFile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(byte[] uploadFile) {
		this.uploadFile = uploadFile;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
