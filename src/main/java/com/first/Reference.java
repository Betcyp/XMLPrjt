package com.first;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"transforms","digestMethod","digestValue",})
public class Reference {
	private String URI;
	private Transforms Transforms;
	private String DigestMethod;
	private String DigestValue;
	
	public Reference(String uri, Transforms transforms,String digestMethod,String digestValue) {
		super();
		this.URI = uri;
		this.Transforms = transforms;
		this.DigestMethod=digestMethod;
		this.DigestValue=digestValue;
	}
	
	@XmlAttribute(name="URI")
	public void setURI(String uri) {
		URI = uri;
	}
	public String getURI() {
		return URI;
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
