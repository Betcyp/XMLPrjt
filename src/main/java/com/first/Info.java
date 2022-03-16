package com.first;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"id", "catCode", "utilCode", "catDesc", "name", "spn_Bnk_Nm"})
public class Info {
	private String Id;
	private String CatCode;
	private String UtilCode;
	private String CatDesc;
	private String Name;
	private String Spn_Bnk_Nm;
	public Info(String id, String catCode, String utilCode, String catDesc, String name, String spn_Bnk_Nm) {
		super();
		this.Id = id;
		this.CatCode = catCode;
		this.UtilCode = utilCode;
		this.CatDesc = catDesc;
		this.Name = name;
		this.Spn_Bnk_Nm = spn_Bnk_Nm;
	}
	@XmlElement(name="Id")
	public void setId(String id) {
		Id = id;
	}
	public String getId() {
		return Id;
	}
	@XmlElement(name="CatCode")
	public void setCatCode(String catCode) {
		CatCode = catCode;
	}
	public String getCatCode() {
		return CatCode;
	}
	@XmlElement(name="UtilCode")
	public void setUtilCode(String utilCode) {
		UtilCode = utilCode;
	}
	public String getUtilCode() {
		return UtilCode;
	}
	@XmlElement(name="CatDesc")
	public void setCatDesc(String catDesc) {
		CatDesc = catDesc;
	}
	public String getCatDesc() {
		return CatDesc;
	}
	@XmlElement(name="Name")
	public void setName(String name) {
		Name = name;
	}
	public String getName() {
		return Name;
	}
	@XmlElement(name="Spn_Bnk_Nm")
	public void setSpn_Bnk_Nm(String spn_Bnk_Nm) {
		Spn_Bnk_Nm = spn_Bnk_Nm;
	}
	public String getSpn_Bnk_Nm() {
		return Spn_Bnk_Nm;
	}
	

}
