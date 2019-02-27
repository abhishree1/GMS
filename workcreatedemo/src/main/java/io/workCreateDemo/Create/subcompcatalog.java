package io.workCreateDemo.Create;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class subcompcatalog {

	String subcompid;
	String subcompname;
	String subcompperform;
	String subcompfunc;
	String subcompmanufacturer;
	String subcomppurchase;
	private compcatalog cat;
	
	
	public subcompcatalog() {
	}
	public subcompcatalog(String comp_id, String comp_name, String comp_perform, String comp_func,
			String comp_manufacturer, String subid,String mid,String subcomppurchase) {
		super();
		this.subcompid = comp_id;
		this.subcompname = comp_name;
		this.subcompperform = comp_perform;
		this.subcompfunc = comp_func;
		this.subcompmanufacturer = comp_manufacturer;
		this.subcomppurchase = subcomppurchase;
		this.cat = new compcatalog(subid,"","","","",mid,"");
	}
	public String getSubcompid() {
		return subcompid;
	}
	public void setSubcompid(String subcompid) {
		this.subcompid = subcompid;
	}
	public String getSubcompname() {
		return subcompname;
	}
	public void setSubcompname(String subcompname) {
		this.subcompname = subcompname;
	}
	public String getSubcompperform() {
		return subcompperform;
	}
	public void setSubcompperform(String subcompperform) {
		this.subcompperform = subcompperform;
	}
	public String getSubcompfunc() {
		return subcompfunc;
	}
	public void setSubcompfunc(String subcompfunc) {
		this.subcompfunc = subcompfunc;
	}
	public String getSubcompmanufacturer() {
		return subcompmanufacturer;
	}
	public void setSubcompmanufacturer(String subcompmanufacturer) {
		this.subcompmanufacturer = subcompmanufacturer;
	}
	public compcatalog getCat() {
		return cat;
	}
	public void setCat(compcatalog cat) {
		this.cat = cat;
	}
	
	
	
}
