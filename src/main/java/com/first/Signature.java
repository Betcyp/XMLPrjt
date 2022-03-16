package com.first;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"signedInfo","signatureValue","keyInfo"})
public class Signature {
	private SignedInfo SignedInfo ;
	private String  SignatureValue;
	private KeyInfo KeyInfo;
	public Signature(SignedInfo signedInfo, String signatureValue, KeyInfo keyInfo) {
		super();
		SignedInfo = signedInfo;
		SignatureValue = signatureValue;
		KeyInfo = keyInfo;
	}
	@XmlElement(name="SignedInfo")
	public void setSignedInfo(SignedInfo signedInfo) {
		SignedInfo = signedInfo;
	}
	public SignedInfo getSignedInfo() {
		return SignedInfo;
	}
	
	@XmlElement(name="SignatureValue")
	public void setSignatureValue(String signatureValue) {
		SignatureValue = signatureValue;
	}
	public String getSignatureValue() {
		return SignatureValue;
	}
	@XmlElement(name="KeyInfo")
	public void setKeyInfo(KeyInfo keyInfo) {
		KeyInfo = keyInfo;
	}
	public KeyInfo getKeyInfo() {
		return KeyInfo;
	}

}
