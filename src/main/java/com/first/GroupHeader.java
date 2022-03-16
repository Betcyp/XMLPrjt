package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"NPCI_RefMsgId","creDtTm","reqInitPty","info"})
public class GroupHeader {
	
	private String NPCI_RefMsgId;
	private String CreDtTm;
	private ReqInitPty ReqInitPty;
	private Info Info;
	public GroupHeader(String nPCI_RefMsgId, String creDtTm,ReqInitPty reqInitPty,Info info) {
		super();
		this.NPCI_RefMsgId = nPCI_RefMsgId;
		this.CreDtTm = creDtTm;
		this.ReqInitPty = reqInitPty;
		this.Info = info;
		
	}

	@XmlElement(name="NPCI_RefMsgId")
	public void setNPCI_RefMsgId(String nPCI_RefMsgId) {
		NPCI_RefMsgId = nPCI_RefMsgId;
	}
	public String getNPCI_RefMsgId() {
		return NPCI_RefMsgId;
	}
	
	@XmlElement(name="CreDtTm")
	public void setCreDtTm(String creDtTm) {
		CreDtTm = creDtTm;
	}
	public String getCreDtTm() {
		return CreDtTm;
	}
	@XmlElement(name="ReqInitPty")
	public void setReqInitPty(ReqInitPty reqInitPty) {
		ReqInitPty = reqInitPty;
	}
	public ReqInitPty getReqInitPty() {
		return ReqInitPty;
	}

	
	@XmlElement(name="Info")
	public void setInfo(Info info) {
		Info = info;
	}
	public Info getInfo() {
		return Info;
	}

}
