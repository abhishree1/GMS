package io.createWork.models;

import java.util.*;

public class subcomp {

	List<subcompcatalog> sub = new ArrayList<>();

	public subcomp() {
	}
	
	public subcomp(List<subcompcatalog> sub) {
		super();
		this.sub = sub;
	}

	public List<subcompcatalog> getSub() {
		return sub;
	}

	public void setSub(List<subcompcatalog> sub) {
		this.sub = sub;
	} 
	
	
}
