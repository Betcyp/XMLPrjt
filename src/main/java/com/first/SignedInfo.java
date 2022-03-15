package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"canonicalizationMethodAlgrthm","signatureMethodAlgorithm","referenceURI"})
public class SignedInfo {
	private String CanonicalizationMethodAlgrthm;
	private String SignatureMethodAlgorithm;
	private ReferenceURI ReferenceURI;
	
	
	public SignedInfo(String canonicalizationMethodAlgrthm, String signatureMethodAlgorithm, 
			ReferenceURI referenceURI) {
		super();
		this.CanonicalizationMethodAlgrthm = canonicalizationMethodAlgrthm;
		this.SignatureMethodAlgorithm = signatureMethodAlgorithm;
		this.ReferenceURI = referenceURI;
		
	}
	@XmlElement(name="CanonicalizationMethod")
	public void setCanonicalizationMethodAlgrthm(String canonicalizationMethodAlgrthm) {
		CanonicalizationMethodAlgrthm = canonicalizationMethodAlgrthm;
	}
	public String getCanonicalizationMethodAlgrthm() {
		return CanonicalizationMethodAlgrthm;
	}
	
	@XmlElement(name="SignatureMethod")
	public void setSignatureMethodAlgorithm(String signatureMethodAlgorithm) {
		SignatureMethodAlgorithm = signatureMethodAlgorithm;
	}
	public String getSignatureMethodAlgorithm() {
		return SignatureMethodAlgorithm;
	}
	
	@XmlElement(name="ReferenceURI")
	public void setReferenceURI(ReferenceURI referenceURI) {
		ReferenceURI = referenceURI;
	}
	public ReferenceURI getReferenceURI() {
		return ReferenceURI;
	}	
}
