package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"nm", "accNo", "mmbId"})
public class CreditAccountDetails {
	private String Nm;
	private String AccNo;
	private String MmbId;
	public CreditAccountDetails(String nm, String accNo, String mmbId) {
		super();
		Nm = nm;
		AccNo = accNo;
		MmbId = mmbId;
	}
	@XmlElement
	public void setNm(String nm) {
		Nm = nm;
	}
	public String getNm() {
		return Nm;
	}
	@XmlElement
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public String getAccNo() {
		return AccNo;
	}
	@XmlElement
	public void setMmbId(String mmbId) {
		MmbId = mmbId;
	}
	public String getMmbId() {
		return MmbId;
	}
}
