package com.ashokit.designpattern.creation.Builder;

public class UserWithoutBuilderExample {

	
	private String fName;
	private String lName;
	private int mobile;
	
	
	
	public UserWithoutBuilderExample(String fName, String lName, int mobile) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.mobile = mobile;
	}


	

	public UserWithoutBuilderExample(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserWithoutBuilderExample u = new UserWithoutBuilderExample("fName", "lName");
		UserWithoutBuilderExample u1 = new UserWithoutBuilderExample("fName", "lName",9876);
		
	}

}
