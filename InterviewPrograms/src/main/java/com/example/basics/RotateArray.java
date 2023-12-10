package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RotateArray {
    private void logic(int[] array,int k) {
        k = k % array.length;
        //Step1: reverse all the numbers  (0-arrayLength-1)
        swap(array,0,array.length-1);
        //Step2: reverse only the k numbers (0,k-1)
        swap(array,0,k-1);
        // Step3: reverse after the K number still to the end of the array length (k to arrayLength-1)
        swap(array,k,array.length-1);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    private void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[]args){
        int array [] = {-1,-100,3,99};
        new RotateArray().logic(array,2);
    }
}
