package com.ashokit.basic.oops;

final class StudentFinal  implements Cloneable{

	private final String name;
	
	public StudentFinal(String name1)
	{
		this.name=name1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		

		return super.clone();
	}
	
	
}
