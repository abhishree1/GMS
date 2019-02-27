package io.workCreateDemo.Create;

import java.util.*;

public class catlist {

	List<catalog> catli = new ArrayList<>();

	public catlist() {
	}

	public catlist(List<catalog> catli) {
		super();
		this.catli = catli;
	}

	public List<catalog> getCatli() {
		return catli;
	}

	public void setCatli(List<catalog> catli) {
		this.catli = catli;
	}
	
	
}
