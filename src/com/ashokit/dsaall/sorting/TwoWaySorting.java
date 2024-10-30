package com.ashokit.dsaall.sorting;


import java.util.Arrays;

public class TwoWaySorting {

	

	
	    public static void main(String[] args) {
	        int[] a = {5, 8, 6, 9};
	        int[] b = {3, 4, 10, 25, 36, 2};

	        
	        TwoWayMerge(a, b);
	    }

	    private static void TwoWayMerge(int[] a, int[] b) {
	        int[] c = new int[a.length + b.length];
	        int i = 0, j = 0, k = 0;

	        Arrays.sort(a);
	        Arrays.sort(b);
	        while (i < a.length && j < b.length) {
	            if (a[i] > b[j]) {
	                c[k] = b[j];
	                j++;
	            } else {
	                c[k] = a[i];
	                i++;
	            }
	            k++;
	        }

	        while (j < b.length) {
	            c[k] = b[j];
	            j++;
	            k++;
	        }

	        while (i < a.length) {
	            c[k] = a[i];
	            i++;
	            k++;
	        }

	        Arrays.stream(c).forEach(t -> System.out.println(t));
	    }
	}
