package com.dsa.Sorting;
import java.util.Arrays;


// Use when:
// - Interviewer asks
// - You want to show how sorting works on small or nearly sorted arrays
// - You want to explain why TimSort uses insertion sort internally for small runs
// Good for small datasets (< 20 elements).

//Time Complexity - Best O(n)
                //- Worst O(n^2)

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,6,5,1,0,11,23,14,12};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    
}
