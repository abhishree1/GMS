package io.workOrder.display;

import java.util.ArrayList;
import java.util.List;

public class work {

	List<workItem> work = new ArrayList<>();

	public work() {
	}
	
	public work(List<workItem> work) {
		super();
		this.work = work;
	}

	public List<workItem> getWork() {
		return work;
	}

	public void setWork(List<workItem> work) {
		this.work = work;
	}
	
	}
