package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"NPCI_RefMsgId","creDtTm","reqInitPty","info"})
public class GroupHeader {
	
	private String NPCI_RefMsgId;
	private String CreDtTm;
	private ReqInitPty ReqInitPty;
	private Info Info;
	public GroupHeader(String NPCI_RefMsgId, String CreDtTm,ReqInitPty ReqInitPty,Info Info) {
		super();
		this.NPCI_RefMsgId = NPCI_RefMsgId;
		this.CreDtTm = CreDtTm;
		this.ReqInitPty = ReqInitPty;
		this.Info = Info;
		
	}

	@XmlElement(name="NPCI_RefMsgId")
	public void setNPCI_RefMsgId(String NPCI_RefMsgId) {
		NPCI_RefMsgId = NPCI_RefMsgId;
	}
	public String getNPCI_RefMsgId() {
		return NPCI_RefMsgId;
	}
	
	@XmlElement(name="CreDtTm")
	public void setCreDtTm(String CreDtTm) {
		CreDtTm = CreDtTm;
	}
	public String getCreDtTm() {
		return CreDtTm;
	}
	@XmlElement(name="ReqInitPty")
	public void setReqInitPty(ReqInitPty ReqInitPty) {
		ReqInitPty = ReqInitPty;
	}
	public ReqInitPty getReqInitPty() {
		return ReqInitPty;
	}

	
	@XmlElement(name="Info")
	public void setInfo(Info Info) {
		Info = Info;
	}
	public Info getInfo() {
		return Info;
	}

}
