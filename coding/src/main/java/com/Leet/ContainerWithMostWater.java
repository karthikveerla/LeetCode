package com.Leet;

import java.util.Arrays;

public class ContainerWithMostWater {


    private static int findCapacity(int[] arr) {
        int capacity = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int height = Math.min(arr[left],arr[right]);
            int cur_capacity = height * (right-left);
            capacity = Math.max(cur_capacity,capacity);
            if(arr[left]<=arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return capacity;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(findCapacity(arr));
    }
}
