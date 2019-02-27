package io.workOrder.display;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class workItem {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	String id;
	String title;
	
	String description;
	
	//@CreationTimestamp
	//LocalDateTime localDateTime;
	
	String priority;
	
	String assignee;
	String location;
	String asset;
	
	public workItem() {
	}
	
	public workItem(String id, String title, String desc, String priority, String assignee,
			String location, String asset) {
		super();
		this.id = id;
		this.title = title;
		this.description = desc;
		//this.localDateTime = localDateTime;
		this.priority = priority;
		this.assignee = assignee;
		this.location = location;
		this.asset = asset;
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

	public void setDescription(String desc) {
		this.description = desc;
	}

	/*public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}*/

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

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}
	
	
}
