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
	public Info(String Id, String CatCode, String UtilCode, String CatDesc, String Name, String Spn_Bnk_Nm) {
		super();
		this.Id = Id;
		this.CatCode = CatCode;
		this.UtilCode = UtilCode;
		this.CatDesc = CatDesc;
		this.Name = Name;
		this.Spn_Bnk_Nm = Spn_Bnk_Nm;
	}
	@XmlElement(name="Id")
	public void setId(String Id) {
		Id = Id;
	}
	public String getId() {
		return Id;
	}
	@XmlElement(name="CatCode")
	public void setCatCode(String CatCode) {
		CatCode = CatCode;
	}
	public String getCatCode() {
		return CatCode;
	}
	@XmlElement(name="UtilCode")
	public void setUtilCode(String UtilCode) {
		UtilCode = UtilCode;
	}
	public String getUtilCode() {
		return UtilCode;
	}
	@XmlElement(name="CatDesc")
	public void setCatDesc(String CatDesc) {
		CatDesc = CatDesc;
	}
	public String getCatDesc() {
		return CatDesc;
	}
	@XmlElement(name="Name")
	public void setName(String Name) {
		Name = Name;
	}
	public String getName() {
		return Name;
	}
	@XmlElement(name="Spn_Bnk_Nm")
	public void setSpn_Bnk_Nm(String Spn_Bnk_Nm) {
		Spn_Bnk_Nm = Spn_Bnk_Nm;
	}
	public String getSpn_Bnk_Nm() {
		return Spn_Bnk_Nm;
	}
	

}
