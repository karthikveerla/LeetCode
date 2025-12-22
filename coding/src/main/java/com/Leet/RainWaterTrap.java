package com.Leet;

public class RainWaterTrap {
    private static int rainWater(int[] arr) {
        int total = 0;
        int left = 0;
        int right = arr.length-1;
        int leftMax = arr[left];
        int rightMax = arr[right];
        while(left<right){
            if(arr[left] < arr[right]){
                leftMax = Math.max(leftMax,arr[left]);
                if(leftMax-arr[left]>0){
                    total = total + leftMax- arr[left];
                }
                left++;
            }
            else{
                rightMax = Math.max(rightMax,arr[right]);
                if(rightMax-arr[right] > 0){
                    total =total + rightMax-arr[right];
                }
                right--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainWater(arr));
    }


}
