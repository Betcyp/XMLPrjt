package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"canonicalizationMethod","signatureMethod","reference"})
public class SignedInfo {
	private String CanonicalizationMethod;
	private String SignatureMethod;
	private Reference Reference;
	
	
	public SignedInfo(String canonicalizationMethod, String signatureMethod, 
			Reference reference) {
		super();
		this.CanonicalizationMethod = canonicalizationMethod;
		this.SignatureMethod = signatureMethod;
		this.Reference = reference;
		
	}
	@XmlElement(name="CanonicalizationMethod")
	public void setCanonicalizationMethod(String canonicalizationMethod) {
		CanonicalizationMethod = canonicalizationMethod;
	}
	public String getCanonicalizationMethod() {
		return CanonicalizationMethod;
	}
	
	@XmlElement(name="SignatureMethod")
	public void setSignatureMethod(String signatureMethod) {
		SignatureMethod = signatureMethod;
	}
	public String getSignatureMethod() {
		return SignatureMethod;
	}
	
	@XmlElement(name="Reference")
	public void setReference(Reference reference) {
		Reference = reference;
	}
	public Reference getReference() {
		return Reference;
	}	
}
