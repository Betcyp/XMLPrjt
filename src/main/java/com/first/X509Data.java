package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"x509SubjectName","x509Certificate"})
public class X509Data {
	private String X509SubjectName;
	private String X509Certificate;
	
	public X509Data(String x509SubjectName, String x509Certificate) {
		super();
		this.X509SubjectName = x509SubjectName;
		this.X509Certificate = x509Certificate;
	}
	@XmlElement(name="X509SubjectName")
	public void setX509SubjectName(String x509SubjectName) {
		X509SubjectName = x509SubjectName;
	}
	public String getX509SubjectName() {
		return X509SubjectName;
	}
	
	@XmlElement(name="X509Certificate")
	public void setX509Certificate(String x509Certificate) {
		X509Certificate = x509Certificate;
	}
	public String getX509Certificate() {
		return X509Certificate;
	}
	
}
