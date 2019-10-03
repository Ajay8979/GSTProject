//package com.ojas.gst.gstr1;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//
//public class TXPAInvoices{
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public Integer getId() {
//		return id;
//	}
//	private Character flag;
//	private String chksum;
//	private String omon;
//	private String pos;
//	private String sply_ty;
//	private String diff_percent;
//	private List<ItemDetails> itms;
//	
//	
//	public Character getFlag() {
//		return flag;
//	}
//	public void setFlag(Character flag) {
//		this.flag = flag;
//	}
//	public String getChksum() {
//		return chksum;
//	}
//	public void setChksum(String chksum) {
//		this.chksum = chksum;
//	}
//	public String getOmon() {
//		return omon;
//	}
//	public void setOmon(String omon) {
//		this.omon = omon;
//	}
//	public String getPos() {
//		return pos;
//	}
//	public void setPos(String pos) {
//		this.pos = pos;
//	}
//	public String getSply_ty() {
//		return sply_ty;
//	}
//	public void setSply_ty(String sply_ty) {
//		this.sply_ty = sply_ty;
//	}
//	public String getDiff_percent() {
//		return diff_percent;
//	}
//	public void setDiff_percent(String diff_percent) {
//		this.diff_percent = diff_percent;
//	}
//	public List<ItemDetails> getItms() {
//		return itms;
//	}
//	public void setItms(List<ItemDetails> itms) {
//		this.itms = itms;
//	}
//	
//}
