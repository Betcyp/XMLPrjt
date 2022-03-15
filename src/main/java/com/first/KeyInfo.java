package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"x509Data"})
public class KeyInfo {
	private X509Data X509Data;
	
	public KeyInfo(X509Data x509Data) {
		super();
		this.X509Data = x509Data;
	}
	@XmlElement(name="X509Data")
	public void setX509Data(X509Data x509Data) {
		X509Data = x509Data;
	}
	public X509Data getX509Data() {
		return X509Data;
	}
}
