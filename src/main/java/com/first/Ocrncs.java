package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"seqTp", "frqcy", "frstColltnDt", "fnlColltnDt"})
public class Ocrncs {
	private String SeqTp;
	private String Frqcy;
	private String FrstColltnDt;
	private String FnlColltnDt;
	public Ocrncs(String seqTp, String frqcy, String frstColltnDt, String fnlColltnDt) {
		super();
		SeqTp = seqTp;
		Frqcy = frqcy;
		FrstColltnDt = frstColltnDt;
		FnlColltnDt = fnlColltnDt;
	}
	@XmlElement
	public void setSeqTp(String seqTp) {
		SeqTp = seqTp;
	}
	public String getSeqTp() {
		return SeqTp;
	}
	@XmlElement
	public void setFrqcy(String frqcy) {
		Frqcy = frqcy;
	}
	public String getFrqcy() {
		return Frqcy;
	}
	@XmlElement
	public void setFrstColltnDt(String frstColltnDt) {
		FrstColltnDt = frstColltnDt;
	}
	public String getFrstColltnDt() {
		return FrstColltnDt;
	}
	@XmlElement
	public void setFnlColltnDt(String fnlColltnDt) {
		FnlColltnDt = fnlColltnDt;
	}
	public String getFnlColltnDt() {
		return FnlColltnDt;
	}
}
