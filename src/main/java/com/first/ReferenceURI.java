package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"transforms","digestMethod","digestValue",})
public class ReferenceURI {
	private Transforms Transforms;
	private String DigestMethod;
	private String DigestValue;
	
	public ReferenceURI(Transforms transforms,String digestMethod,String digestValue) {
		super();
		this.Transforms = transforms;
		this.DigestMethod=digestMethod;
		this.DigestValue=digestValue;
	}
	@XmlElement(name="Transforms")
	public void setTransforms(Transforms transforms) {
		Transforms = transforms;
	}
	public Transforms getTransforms() {
		return Transforms;
	}
	@XmlElement(name="DigestMethod")
	public void setDigestMethod(String digestMethod) {
		DigestMethod = digestMethod;
	}
	public String getDigestMethod() {
		return DigestMethod;
	}
	@XmlElement(name="DigestValue")
	public void setDigestValue(String digestValue) {
		DigestValue = digestValue;
	}
	public String getDigestValue() {
		return DigestValue;
	}
}
