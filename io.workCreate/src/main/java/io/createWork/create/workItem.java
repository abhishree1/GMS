package io.createWork.create;

import javax.persistence.Column;

//import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

//import org.hibernate.annotations.CreationTimestamp;

@Entity
public class workItem {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	String id;
	String title;
	String description;//@CreationTimestamp LocalDateTime localDateTime;
	String priority;
	String assignee;
	String location;
	String machineid;
	String machinename;
	@JsonFormat(pattern="dd-mm-yyyy",shape=Shape.STRING)
	String dueDate;
	
	public workItem() {
	}


	public workItem(String id, String title, String description, String priority, String assignee, String location,
			String machineid, String machinename,String dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.assignee = assignee;
		this.location = location;
		this.machineid = machineid;
		this.machinename = machinename;
		this.dueDate= dueDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
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

	
	
}
