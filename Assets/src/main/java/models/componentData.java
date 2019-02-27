package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class componentData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	String sm_id;
	String m_id;
	String sm_perform;
	String sm_name;
	String sm_func;
	/**
	 * @param sm_id
	 * @param m_id
	 * @param sm_perform
	 * @param sm_name
	 * @param sm_func
	 */
	public componentData() {
		
	}
	
	public componentData(String sm_id, String m_id, String sm_perform, String sm_name, String sm_func) {
		super();
		this.sm_id = sm_id;
		this.m_id = m_id;
		this.sm_perform = sm_perform;
		this.sm_name = sm_name;
		this.sm_func = sm_func;
	}
	public String getSm_id() {
		return sm_id;
	}
	public void setSm_id(String sm_id) {
		this.sm_id = sm_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getSm_perform() {
		return sm_perform;
	}
	public void setSm_perform(String sm_perform) {
		this.sm_perform = sm_perform;
	}
	public String getSm_name() {
		return sm_name;
	}
	public void setSm_name(String sm_name) {
		this.sm_name = sm_name;
	}
	public String getSm_func() {
		return sm_func;
	}
	public void setSm_func(String sm_func) {
		this.sm_func = sm_func;
	}
	
	
	
	
}