package io.AssetDisplay.compdisplay;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.AssetDisplay.display.catalog;

@Entity
public class compcatalog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String compid;
	String compname;
	String compperform;
	String compfunc;
	String compmanufacturer;
	//Date comppurchase;
	@ManyToOne
	private catalog cat;
	
	
	public compcatalog() {
	}
	public compcatalog(String comp_id, String comp_name, String comp_perform, String comp_func,
			String comp_manufacturer,String m_id) {
		super();
		this.compid = comp_id;
		this.compname = comp_name;
		this.compperform = comp_perform;
		this.compfunc = comp_func;
		this.compmanufacturer = comp_manufacturer;
		//this.comppurchase = comp_purchase;
		this.cat = new catalog(m_id,"","","","","");
	}
	public String getCompid() {
		return compid;
	}
	public void setCompid(String comp_id) {
		this.compid = comp_id;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String comp_name) {
		this.compname = comp_name;
	}
	public String getCompperform() {
		return compperform;
	}
	public void setCompperform(String comp_perform) {
		this.compperform = comp_perform;
	}
	public String getCompfunc() {
		return compfunc;
	}
	public void setCompfunc(String comp_func) {
		this.compfunc = comp_func;
	}
	public String getCompmanufacturer() {
		return compmanufacturer;
	}
	public void setCompmanufacturer(String comp_manufacturer) {
		this.compmanufacturer = comp_manufacturer;
	}
	/*public Date getComppurchase() {
		return comppurchase;
	}
	public void setComppurchase(Date comp_purchase) {
		this.comppurchase = comp_purchase;
	}*/
	public catalog getCat() {
		return cat;
	}
	public void setCat(catalog cat) {
		this.cat = cat;
	}
	
	
}
