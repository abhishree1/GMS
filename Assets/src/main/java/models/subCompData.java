package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class subCompData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	String ssm_id;
	String sm_id;
	String ssm_perform;
	String ssm_name;
	String ssm_func;
	/**
	 * @param ssm_id
	 * @param sm_id
	 * @param ssm_perform
	 * @param ssm_name
	 * @param ssm_func
	 */
	
	public subCompData() {
	}
	
	public subCompData(String ssm_id, String sm_id, String ssm_perform, String ssm_name, String ssm_func) {
		super();
		this.ssm_id = ssm_id;
		this.sm_id = sm_id;
		this.ssm_perform = ssm_perform;
		this.ssm_name = ssm_name;
		this.ssm_func = ssm_func;
	}
	public String getSsm_id() {
		return ssm_id;
	}
	public void setSsm_id(String ssm_id) {
		this.ssm_id = ssm_id;
	}
	public String getSm_id() {
		return sm_id;
	}
	public void setSm_id(String sm_id) {
		this.sm_id = sm_id;
	}
	public String getSsm_perform() {
		return ssm_perform;
	}
	public void setSsm_perform(String ssm_perform) {
		this.ssm_perform = ssm_perform;
	}
	public String getSsm_name() {
		return ssm_name;
	}
	public void setSsm_name(String ssm_name) {
		this.ssm_name = ssm_name;
	}
	public String getSsm_func() {
		return ssm_func;
	}
	public void setSsm_func(String ssm_func) {
		this.ssm_func = ssm_func;
	}
	
	
	
	
}
