package com.ojas.gst.returns.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Proxy(lazy = false)
public class Gstr1Request implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String gstin;

	private String Ref_id;

	public String getRef_id() {
		return Ref_id;
	}

	public void setRef_id(String ref_id) {
		Ref_id = ref_id;
	}

	private String ret_period;

	private Double gt;

	private Double cur_gt;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2b_id")
	private List<B2BInvoices> b2b;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2ba_id")
	private List<B2BAInvoice> b2ba;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2cl_id")
	private List<B2CLInvoices> b2cl;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2cla_id")
	private List<B2CLAInVoices> b2cla;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2cs_id")
	private List<B2CSDetails> b2cs;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2csa_id")
	private List<B2CSA> b2csa;

	@OneToOne(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	private NilSupplies nil;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "txpda_inv_id")
	private List<TXPAData> txpda;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "txp_inv_id")
	private List<TXPInvoices> txpd;

	@OneToOne(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	private HSNData hsn ;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "expa_inv_id")
	private List<EXPAInvoices> expa;
	
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "exp_inv_id")
	private List<EXPInvoices> exp;

	@OneToOne(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	private DOCIssuedInvoices doc_issue;
	
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cdnura_id")
	private List<CDNURAData> cdnura ;
	
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cdnur_id")
	private List<CDNURData> cdnur ;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cdnra_id")
	private List<CDNRAData> cdnra ;

	
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cdnr_id")
	private List<CDNRData> cdnr ;
	
	
	
	public List<CDNRData> getCdnr() {
		return cdnr;
	}

	public void setCdnr(List<CDNRData> cdnr) {
		this.cdnr = cdnr;
	}

	public List<CDNRAData> getCdnra() {
		return cdnra;
	}

	public void setCdnra(List<CDNRAData> cdnra) {
		this.cdnra = cdnra;
	}

	public List<CDNURData> getCdnur() {
		return cdnur;
	}

	public void setCdnur(List<CDNURData> cdnur) {
		this.cdnur = cdnur;
	}

	public List<CDNURAData> getCdnura() {
		return cdnura;
	}

	public void setCdnura(List<CDNURAData> cdnura) {
		this.cdnura = cdnura;
	}

	public DOCIssuedInvoices getDoc_issue() {
		return doc_issue;
	}

	public void setDoc_issue(DOCIssuedInvoices doc_issue) {
		this.doc_issue = doc_issue;
	}

	public List<EXPInvoices> getExp() {
		return exp;
	}

	public void setExp(List<EXPInvoices> exp) {
		this.exp = exp;
	}

	public List<EXPAInvoices> getExpa() {
		return expa;
	}

	public void setExpa(List<EXPAInvoices> expa) {
		this.expa = expa;
	}

	public HSNData getHsn() {
		return hsn;
	}

	public void setHsn(HSNData hsn) {
		this.hsn = hsn;
	}

	public List<TXPInvoices> getTxpd() {
		return txpd;
	}

	public void setTxpd(List<TXPInvoices> txpd) {
		this.txpd = txpd;
	}

	public List<TXPAData> getTxpda() {
		return txpda;
	}

	public void setTxpda(List<TXPAData> txpda) {
		this.txpda = txpda;
	}

	public NilSupplies getNil() {
		return nil;
	}

	public void setNil(NilSupplies nil) {
		this.nil = nil;
	}

	public List<B2CSA> getB2csa() {
		return b2csa;
	}

	public void setB2csa(List<B2CSA> b2csa) {
		this.b2csa = b2csa;
	}

	public List<B2CSDetails> getB2cs() {
		return b2cs;
	}

	public void setB2cs(List<B2CSDetails> b2cs) {
		this.b2cs = b2cs;
	}

	public List<B2CLAInVoices> getB2cla() {
		return b2cla;
	}

	public void setB2cla(List<B2CLAInVoices> b2cla) {
		this.b2cla = b2cla;
	}

	public List<B2CLInvoices> getB2cl() {
		return b2cl;
	}

	public void setB2cl(List<B2CLInvoices> b2cl) {
		this.b2cl = b2cl;
	}

	public List<B2BAInvoice> getB2ba() {
		return b2ba;
	}

	public void setB2ba(List<B2BAInvoice> b2ba) {
		this.b2ba = b2ba;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getRet_period() {
		return ret_period;
	}

	public void setRet_period(String ret_period) {
		this.ret_period = ret_period;
	}

	public Double getGt() {
		return gt;
	}

	public void setGt(Double gt) {
		this.gt = gt;
	}

	public Double getCur_gt() {
		return cur_gt;
	}

	public void setCur_gt(Double cur_gt) {
		this.cur_gt = cur_gt;
	}

	public List<B2BInvoices> getB2b() {
		return b2b;
	}

	public void setB2b(List<B2BInvoices> b2b) {
		this.b2b = b2b;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
