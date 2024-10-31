package com.ashokit.dsaall.sorting;

import java.util.Arrays;

public class AddingElementToMaxHeap {

    public static void main(String[] args) {
        
        int[] a = {15, 10, 8, 7, 6, 5};
        int input = 19;
        a = maxHeap(input, a);
        System.out.println(Arrays.toString(a));
    }

    private static int[] maxHeap(int elementToInsert, int[] a) {
        
        // Create a new array with an extra slot for the new element
        int[] b = new int[a.length + 1];
        
        // Copy the original array to the new array
        System.arraycopy(a, 0, b, 0, a.length);

        // Insert the new element at the last position
        b[b.length - 1] = elementToInsert;
        int lastIndex = b.length - 1;

        // Reheapify to maintain the max heap property
        while (lastIndex > 0) {

            int parentIndex = (lastIndex - 1) / 2;

            if (b[parentIndex] < b[lastIndex]) {
                // Swap parent and child if the parent is smaller
                int temp = b[lastIndex];
                b[lastIndex] = b[parentIndex];
                b[parentIndex] = temp;

                // Move up to continue reheapifying
                lastIndex = parentIndex;
            } else {
                break;
            }
        }
        
        return b;
    }
}
