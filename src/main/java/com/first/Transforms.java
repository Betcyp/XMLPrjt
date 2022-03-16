package com.first;

import javax.xml.bind.annotation.XmlElement;


public class Transforms {
	private String Transform;

	public Transforms(String transform) {
		super();
		this.Transform = transform;
	}

	@XmlElement(name="Transform")
	public void setTransform(String transform) {
		Transform = transform;
	}
	
	public String getTransform() {
		return Transform;
	}

}
