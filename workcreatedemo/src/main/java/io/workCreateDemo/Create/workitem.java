package io.workCreateDemo.Create;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class workitem {

	@Id
	String id;
	String title;
	String description;
	String priority;
	String assignee;
	String location;
	String machineid;
	String machinename;
	@JsonFormat(pattern="dd-mm-yyyy",shape=Shape.STRING)
	String startDate;
	String dueDate;
	
	public workitem() {
	}
	
	
	public workitem(String id, String title, String description, String priority, String assignee, String location,
			String machineid, String machinename, String startDate, String dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.assignee = assignee;
		this.location = location;
		this.machineid = machineid;
		this.machinename = machinename;
		this.startDate = startDate;
		this.dueDate = dueDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMachineid() {
		return machineid;
	}
	public void setMachineid(String machineid) {
		this.machineid = machineid;
	}
	public String getMachinename() {
		return machinename;
	}
	public void setMachinename(String machinename) {
		this.machinename = machinename;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
}
