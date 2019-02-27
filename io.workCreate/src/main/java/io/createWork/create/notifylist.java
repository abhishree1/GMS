package io.createWork.create;

import java.util.*;

public class notifylist {

	String assetid;
	String workdetails;
	
	List<String> notify = new ArrayList<>();

	public notifylist() {
		
	}

	public notifylist(String assetid, String workdetails, List<String> notify) {
		super();
		this.assetid = assetid;
		this.workdetails = workdetails;
		this.notify = notify;
	}

	public String getAssetid() {
		return assetid;
	}

	public void setAssetid(String assetid) {
		this.assetid = assetid;
	}

	public String getWorkdetails() {
		return workdetails;
	}

	public void setWorkdetails(String workdetails) {
		this.workdetails = workdetails;
	}

	public List<String> getNotify() {
		return notify;
	}

	public void setNotify(List<String> notify) {
		this.notify = notify;
	}
	
	public void initData(String assetid, String workDetail, List<String> notifyDates) {
		this.assetid = assetid;
		this.workdetails = workDetail;
		this.notify=notifyDates;
	}
}
