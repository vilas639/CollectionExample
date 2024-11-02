package com.ashokit.dsaall.problem;

import java.util.Arrays;

public class reverseArrayWithoutExtraMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//with memeory
		int a[]= {4,2,6,1,7};
		int b[]=new int[a.length];
		int j=0;
		
		for (int i = a.length-1; i >=0; i--) {
			
			b[j]=a[i];
			j++;
		}
		
	
		Arrays.stream(b).forEach(t -> System.out.println(t));
		
		//without memnory
		for (int i = 0,k=a.length-1; i < k; i++,k--) {//0 ,4 0<4 
			int temp=a[i];//4
			a[i]=a[k];//7
			a[k]=temp;//4
			
			
			
		}
		
		Arrays.stream(a).forEach(t -> System.out.println(t));
		
		//without temp variable 
		for (int i = 0,k=a.length-1; i < k; i++,k--) {
		a[i]=a[i]+a[k];//4+7=11
		a[k]=a[i]-a[k];//11-7=4
		a[i]=a[i]-a[k];//11-4=7
}
		
		Arrays.stream(a).forEach(t -> System.out.println(t));
		
		
		//using recurssion
		
		reverseArray(a, 0, a.length - 1);
		
	}
	
	
	private static void reverseArray(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        
        // Swap the elements at start and end
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        
        // Recursive call to reverse the remaining elements
        reverseArray(a, start + 1, end - 1);
    }

}
