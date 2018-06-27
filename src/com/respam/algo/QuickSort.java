package com.respam.algo;

/**
 * Created by S P Mahapatra on 27/06/2018.
 */
public class QuickSort {

    public void quickSortArray(int arr[], int low, int high){
        if(low < high){
            // pi is the partitioning index, arr[pi]
            // is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSortArray(arr, low, pi-1);
            quickSortArray(arr, pi+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1; // index of smaller element
        for(int j=low; j<high; j++){
            // if current element is smaller than or equal to pivot
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
