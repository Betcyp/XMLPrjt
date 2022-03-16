package com.first;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http:npci.org/onmags/schema",name="Document")
public class Document {
	
	private ArrayList<MndtAuthRequest> mndtReq;
	private ArrayList<GroupHeader> grp;
	private ArrayList<Mndt> mndt;
	private ArrayList<Signature> sign;
	
	
	public Document() {
		super();
		this.mndtReq = new ArrayList<MndtAuthRequest>();
		this.grp = new ArrayList<GroupHeader>();
		this.mndt = new ArrayList<Mndt>();
		this.sign=new ArrayList<Signature>();
	}
	

	@XmlElement(name="MndtAuthReq")
	public ArrayList<MndtAuthRequest> getDocument() {
		return mndtReq;
	}
	@XmlElement(name="GrpHdr")
	public ArrayList<GroupHeader> getDocument1() {
		return grp;
	}
	
	@XmlElement(name="Mndt")
	public ArrayList<Mndt> getDocument2() {
		return mndt;
	}

    @XmlElement(namespace="http://www.w3.org/xmldsig#",name="Signature")
	public ArrayList<Signature> getDocument3() {
		return sign;
	}

	public void addMndAuthRequest(MndtAuthRequest mndtAuthRequest ) {
		this.mndtReq.add(mndtAuthRequest);
		
	}
	
	public void addSignature(Signature signature ) {
		this.sign.add(signature);
		
	}
}
 
