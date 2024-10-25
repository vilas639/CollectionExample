package com.ashokit.threadall.threadpool;

public class Customer {

	
	String name;
	String policynumber;
	String message;
	double preimim;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(String name, String policynumber, double preimim) {
		super();
		this.name = name;
		this.policynumber = policynumber;
		this.preimim = preimim;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(String policynumber) {
		this.policynumber = policynumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPreimim() {
		return preimim;
	}

	public void setPreimim(double preimim) {
		this.preimim = preimim;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", policynumber=" + policynumber + ", message=" + message + ", preimim="
				+ preimim + "]";
	}
	
	
	
}
