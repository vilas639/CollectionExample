package com.ashokit.queue;

import java.util.Comparator;

public class Department implements Comparable<Department>{
	int depId;
	String depName;
	

	public Department(int depId, String depName) {
		super();
		this.depId = depId;
		this.depName = depName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public Department(int depId) {
		super();
		this.depId = depId;
	}

	
	public int compare(Department o1, Department o2) {
		// TODO Auto-generated method stub
		  return (o1.getDepId() < o2.getDepId()) ? -1 : ((o1.getDepId() == o2.getDepId()) ? 0 : 1);
	}

	@Override
	public int compareTo(Department o) {
		
		return compare(o,this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dep Name and Id is"+depId+" "+depName;
	}

}
