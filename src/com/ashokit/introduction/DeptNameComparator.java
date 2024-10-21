package com.ashokit.introduction;

import java.util.Comparator;

public class DeptNameComparator implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		// TODO Auto-generated method stub
		return o1.getDepName().compareTo(o2.getDepName());
	}

}
