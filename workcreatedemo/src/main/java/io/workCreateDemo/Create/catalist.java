package io.workCreateDemo.Create;

public class catalist {

	String mid;
	String mname;
	
	public catalist() {
	}
	public catalist(String mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public void initData(String mid,String mname) {
		this.mid = mid;
		this.mname=mname;
	}
}
