package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"nm", "accNo", "acct_Type", "cons_Ref_No", "phone", "mobile","email"})
public class DebitTransactions {
	private String Nm;
	private String AccNo;
	private String Acct_Type;
	private int Cons_Ref_No;
	private String Phone;
	private String Mobile;
	private String Email;
	public DebitTransactions(String nm, String accNo, String acct_Type, int cons_Ref_No, String phone, String mobile,
			String email) {
		super();
		Nm = nm;
		AccNo = accNo;
		Acct_Type = acct_Type;
		Cons_Ref_No = cons_Ref_No;
		Phone = phone;
		Mobile = mobile;
		Email = email;
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
	public void setAcct_Type(String acct_Type) {
		Acct_Type = acct_Type;
	}
	public String getAcct_Type() {
		return Acct_Type;
	}
	@XmlElement
	public void setCons_Ref_No(int cons_Ref_No) {
		Cons_Ref_No = cons_Ref_No;
	}
	public int getCons_Ref_No() {
		return Cons_Ref_No;
	}
	@XmlElement
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPhone() {
		return Phone;
	}
	@XmlElement
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getMobile() {
		return Mobile;
	}
	@XmlElement
	public void setEmail(String email) {
		Email = email;
	}
	public String getEmail() {
		return Email;
	}

}
