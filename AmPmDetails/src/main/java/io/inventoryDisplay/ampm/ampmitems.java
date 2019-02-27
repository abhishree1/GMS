package io.inventoryDisplay.ampm;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class ampmitems {
	
	
	@Id
	String assetid;
	
	String typeofmain;
	String workdetails;
	@JsonFormat(pattern="dd-mm-yyyy",shape=Shape.STRING)
	String startdate;
	String enddate;
	List<String> notifydate;
	
	public ampmitems() {
		
	}
	
	public ampmitems(String assetid, String typeofmain, String workdetails, String startdate, String enddate,
			List<String> notifydate) {
		super();
		this.assetid = assetid;
		this.typeofmain = typeofmain;
		this.workdetails = workdetails;
		this.startdate = startdate;
		this.enddate = enddate;
		this.notifydate = notifydate;
	}
	
	public String getAssetid() {
		return assetid;
	}
	public void setAssetid(String assetid) {
		this.assetid = assetid;
	}
	public String getTypeofmain() {
		return typeofmain;
	}
	public void setTypeofmain(String typeofmain) {
		this.typeofmain = typeofmain;
	}
	public String getWorkdetails() {
		return workdetails;
	}
	public void setWorkdetails(String workdetails) {
		this.workdetails = workdetails;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public List<String> getNotifydate() {
		return notifydate;
	}
	public void setNotifydate(List<String> list) {
		this.notifydate = list;
	}
	
}
