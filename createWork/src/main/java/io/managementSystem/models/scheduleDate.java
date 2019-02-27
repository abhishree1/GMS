package io.managementSystem.models;

import java.util.Date;

public class scheduleDate {

	Date startdate;
	Date duedate;
	
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public scheduleDate(Date startdate, Date duedate) {
		super();
		this.startdate = startdate;
		this.duedate = duedate;
	}
	
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getDuedate() {
		return duedate;
	}
	
	
}
