package com.first;

import javax.xml.bind.annotation.XmlElement;

public class Transforms {
	private String TransformAlgorithm;

	public Transforms(String transformAlgorithm) {
		super();
		this.TransformAlgorithm = transformAlgorithm;
	}

	@XmlElement(name="TransformAlgorithm")
	public void setTransformAlgorithm(String transformAlgorithm) {
		TransformAlgorithm = transformAlgorithm;
	}
	
	public String getTransformAlgorithm() {
		return TransformAlgorithm;
	}

}
