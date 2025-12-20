package com.dsa.Searching;
import java.util.*;

//Time Complexity - O(log n)
// works on sorted array


public class BinarySearch {

    public static int findElement(int[] arr,int target){
        int left =0;
        int right = arr.length;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid]<target){
                left = mid+1;
            }
            if(arr[mid]>target){
                right = mid-1;
            }
            if(arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,10,24,32,49,51,67,72,83,88};
        int target = 11;
        System.out.println(findElement(arr,target));

        //inbuilt java function for binary search
        System.out.println(Arrays.binarySearch(arr,target));
    }
}
