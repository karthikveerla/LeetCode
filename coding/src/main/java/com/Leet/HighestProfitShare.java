package com.Leet;

public class HighestProfitShare {
    public static void main(String[] args) {
        int[] arr = {1,1,5,3,6,9};
        int profit = 0;
        int buy = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buy){
                buy = arr[i];
            }
            profit = Math.max(profit,arr[i]-buy);
        }
        System.out.println(profit);
    }
}
