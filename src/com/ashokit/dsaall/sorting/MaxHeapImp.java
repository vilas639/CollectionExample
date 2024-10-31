package com.ashokit.dsaall.sorting;

import java.util.Arrays;

public class MaxHeapImp {

    public static void main(String[] args) {
        
        // Convert the given array to a max-heap
        int[] a = {5, 2, 7, 10, 23, 45, 21};
        
        // Perform heap sort
        heapSort(a);

        // Display the sorted array
        Arrays.stream(a).forEach(t -> System.out.println(t));
    }

    public static void heapSort(int[] a) {
        
        int n = a.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(i, a, n);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            // Call max heapify on the reduced heap
            heapify(0, a, i);
        }
    }

    public static void heapify(int i, int[] a, int length) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < length && a[leftChild] > a[largest]) {//for minheap change >
            largest = leftChild;
        }
        
        if (rightChild < length && a[rightChild] > a[largest]) {////for minheap change >
            largest = leftChild;
            largest = rightChild;
        }

        if (largest != i) {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(largest, a, length);
        }
    }
}
