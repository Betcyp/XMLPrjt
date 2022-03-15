package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"grpHdr","mndt"})
public class MndtAuthRequest {
	
	private GroupHeader GrpHdr;
	private Mndt Mndt;
	public MndtAuthRequest(GroupHeader grpHdr, Mndt mndt) {
		super();
		GrpHdr = grpHdr;
		Mndt = mndt;
	}
	@XmlElement(name="GrpHdr")
	public void setGrpHdr(GroupHeader grpHdr) {
		GrpHdr = grpHdr;
	}
	public GroupHeader getGrpHdr() {
		return GrpHdr;
	}
	@XmlElement(name="Mndt")
	public void setMndt(Mndt mndt) {
		Mndt = mndt;
	}
	public Mndt getMndt() {
		return Mndt;
	}

}
