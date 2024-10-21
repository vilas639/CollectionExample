package com.ashokit.introduction;

public class Department implements Comparable<Department>{

	int depId;
	public Department(int depId, String depName) {
		super();
		this.depId = depId;
		this.depName = depName;
	}

	String depName;
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int depId) {
		super();
		this.depId = depId;
	}
	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		 return compare(this.depId,o.depId);
	}
	
	public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DepId is "+this.depId+" Dep Name is "+this.depName;
	}
	
}
