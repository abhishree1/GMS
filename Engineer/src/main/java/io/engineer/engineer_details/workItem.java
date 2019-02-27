package io.engineer.engineer_details;

import java.time.LocalDateTime;
import java.util.Date;

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
	Date scheduledate;
	
	String assignee;
	String location;
	String asset;
	
	public workItem() {
	}
	
	public workItem(String id, String title, String desc, Date date, String assignee,
			String location, String asset) {
		super();
		this.id = id;
		this.title = title;
		this.description = desc;
		//this.localDateTime = localDateTime;
		this.assignee = assignee;
		this.location = location;
		this.asset = asset;
		this.scheduledate = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Date getScheduledate() {
		return scheduledate;
	}

	public void setScheduledate(Date scheduledate) {
		this.scheduledate = scheduledate;
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
