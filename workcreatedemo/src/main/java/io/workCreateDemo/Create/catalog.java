package io.workCreateDemo.Create;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class catalog {

	
	String mid;
	String mname;
	String mperform;
	String mfunc;
	String mmanufacturer;
	String mpurchase;
	//image
	/**
	 * @param m_id
	 * @param m_Name
	 * @param m_perform
	 * @param m_componame
	 * @param m_func
	 * @param m_manufacturer
	 * @param m_purchase
	 */
	
	public catalog() {
	}
	
	public catalog(String m_id, String m_name, String m_perform,String m_func, String m_manufacturer,String mpurchase) {
		super();
		this.mid = m_id;
		this.mname = m_name;
		this.mperform = m_perform;
		this.mfunc = m_func;
		this.mmanufacturer = m_manufacturer;
		this.mpurchase = mpurchase;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String m_id) {
		this.mid = m_id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String m_name) {
		this.mname = m_name;
	}
	public String getMperform() {
		return mperform;
	}
	public void setMperform(String m_perform) {
		this.mperform = m_perform;
	}
	
	public String getMfunc() {
		return mfunc;
	}
	public void setMfunc(String m_func) {
		this.mfunc = m_func;
	}
	public String getMmanufacturer() {
		return mmanufacturer;
	}
	public void setMmanufacturer(String m_manufacturer) {
		this.mmanufacturer = m_manufacturer;
	}
	public String getMpurchase() {
		return mpurchase;
	}
	public void setMpurchase(String mpurchase) {
		this.mpurchase = mpurchase;
	}
	
	
	

	
	
}
