package com.ashokit.dsaall.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {15,2,5,3,8,1};
		a=insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

	private static int[] insertionSort(int[] a) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < a.length; i++) {
			int key=a[i]; //2
			int j=i-1;//0
			
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}
		return a;
	}

}
