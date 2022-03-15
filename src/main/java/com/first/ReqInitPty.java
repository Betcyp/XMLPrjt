package com.first;

import javax.xml.bind.annotation.XmlElement;

public class ReqInitPty {
	private Info Info;

	public ReqInitPty(Info Info) {
		super();
		this.Info = Info;
	}
	@XmlElement(name="Info")
	public void setInfo(Info Info) {
		this.Info = Info;
	}
	public Info getInfo() {
		return Info;
	}

	
}
