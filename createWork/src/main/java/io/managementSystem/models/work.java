package io.managementSystem.models;

public class work {

	String workid;
	String work_desc;
	String location;
	
	public work() {
	}
	
	public work(String workid, String work_desc,String location) {
		super();
		this.workid = workid;
		this.work_desc = work_desc;
		this.location = location;
	}
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWorkid() {
		return workid;
	}
	public void setWorkid(String workid) {
		this.workid = workid;
	}
	public String getWork_desc() {
		return work_desc;
	}
	public void setWork_desc(String work_desc) {
		this.work_desc = work_desc;
	}
	
	
}
