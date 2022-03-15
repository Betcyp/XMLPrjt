package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"mndtReqId", "mndt_Type", "schm_Nm", "mndtId", "ocrncs", "colltnAmt","maxAmt","dbtr","crAccDtl"})
public class Mndt {
	private String MndtReqId;
	private String Mndt_Type;
	private int Schm_Nm;
	private String MndtId;
	private Ocrncs Ocrncs;
	private String ColltnAmt;
	private String MaxAmt;
	private DebitTransactions Dbtr;
	private CreditAccountDetails CrAccDtl;
	
	public Mndt(String mndtReqId, String mndt_Type, int schm_Nm, String mndtId, Ocrncs ocrncs, String colltnAmt,
			String maxAmt, DebitTransactions dbtr, CreditAccountDetails crAccDtl) {
		super();
		MndtReqId = mndtReqId;
		Mndt_Type = mndt_Type;
		Schm_Nm = schm_Nm;
		MndtId = mndtId;
		Ocrncs = ocrncs;
		ColltnAmt = colltnAmt;
		MaxAmt = maxAmt;
		Dbtr = dbtr;
		CrAccDtl = crAccDtl;
	}
	
	@XmlElement(name="MndtReqId")
	public void setMndtReqId(String mndtReqId) {
		MndtReqId = mndtReqId;
	}
	public String getMndtReqId() {
		return MndtReqId;
	}
	@XmlElement(name="Mndt_Type")
	public void setMndt_Type(String mndt_Type) {
		Mndt_Type = mndt_Type;
	}
	public String getMndt_Type() {
		return Mndt_Type;
	}
	@XmlElement(name="Schm_Nm")
	public void setSchm_Nm(int schm_Nm) {
		Schm_Nm = schm_Nm;
	}
	public int getSchm_Nm() {
		return Schm_Nm;
	}
	@XmlElement(name="MndtId")
	public void setMndtId(String mndtId) {
		MndtId = mndtId;
	}
	public String getMndtId() {
		return MndtId;
	}
	@XmlElement(name="Ocrncs")
	public void setOcrncs(Ocrncs ocrncs) {
		Ocrncs = ocrncs;
	}
	public Ocrncs getOcrncs() {
		return Ocrncs;
	}
	@XmlElement(name="ColltnAmt")
	public void setColltnAmt(String colltnAmt) {
		ColltnAmt = colltnAmt;
	}
	public String getColltnAmt() {
		return ColltnAmt;
	}
	@XmlElement(name="MaxAmt")
	public void setMaxAmt(String maxAmt) {
		MaxAmt = maxAmt;
	}
	public String getMaxAmt() {
		return MaxAmt;
	}
	@XmlElement(name="Dbtr")
	public void setDbtr(DebitTransactions dbtr) {
		Dbtr = dbtr;
	}
	public DebitTransactions getDbtr() {
		return Dbtr;
	}
	@XmlElement(name="CrAccDtl")
	public void setCrAccDtl(CreditAccountDetails crAccDtl) {
		CrAccDtl = crAccDtl;
	}
	public CreditAccountDetails getCrAccDtl() {
		return CrAccDtl;
	}
}
