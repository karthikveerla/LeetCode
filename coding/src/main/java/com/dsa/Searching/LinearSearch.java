package com.dsa.Searching;

//Time Complexity - O(n)
//works on any array sorted/unsorted

public class LinearSearch {
    public static int findElement(int[] arr, int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,8,6,9,4,5,2,3,0};
        int target = 2;
        System.out.print(findElement(arr,target));
    }
}
