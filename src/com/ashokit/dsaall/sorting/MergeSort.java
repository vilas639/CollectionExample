package com.ashokit.dsaall.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {13, 11, 9, 5, 4, 3};
        
        mergeSort(a, 0, a.length - 1);

        Arrays.stream(a).forEach(System.out::println);
    }

    private static void mergeSort(int[] a, int l, int h) {
        if (l < h) {
            // Corrected formula for calculating the middle element
            int m = l + (h - l) / 2;
            
            // Sort left half
            mergeSort(a, l, m);
            // Sort right half
            mergeSort(a, m + 1, h);
            
            // Merge sorted halves
            merge(a, l, m, h);
        }
    }

    private static void merge(int[] a, int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            left[i] = a[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = a[m + 1 + j];

        // Merge the two arrays
        int i = 0, j = 0;
        int k = l;
        
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of left[]
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements of right[]
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
