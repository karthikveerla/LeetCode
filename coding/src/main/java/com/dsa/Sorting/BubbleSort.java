package com.dsa.Sorting;

import java.util.Arrays;


//Time Complexity -O(n^2)
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{3,2,6,5,1,0,11,23,14,12};
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
