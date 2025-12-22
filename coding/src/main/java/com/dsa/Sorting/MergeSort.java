package com.dsa.Sorting;

import java.util.Arrays;

public class MergeSort {

    private static void mergeSortfn(int[] arr) {
        int len = arr.length;
        if(len < 2) return ;
        int mid = len/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len-mid];
        int i=0,j=0;
        for(;i<len;i++){
            if(i<mid){
                leftArr[i] = arr[i];
            }
            else{
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSortfn(leftArr);
        mergeSortfn(rightArr);
        merge(leftArr,rightArr,arr);
        
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;
        int l = 0, r=0,i=0;
        while(l<leftSize&&r<rightSize){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                l++;
                i++;
            }
            else{
                arr[i] = rightArr[r];
                r++;
                i++;
            }
        }
        while(l<leftSize){
            arr[i] = leftArr[l];
            l++;
            i++;
        }
        while(r<rightSize){
            arr[i] = rightArr[r];
            r++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,6,5,1,0,11,23,14,12};
        mergeSortfn(arr);
        System.out.println(Arrays.toString(arr));
    }

}
    

