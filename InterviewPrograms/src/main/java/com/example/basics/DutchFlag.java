package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DutchFlag {
    private void logic(int array[]){
        int start = 0;
        int middle= 0;
        int last = array.length-1;
        while (middle<=last){
            switch (array[middle]){
                case 0:
                    swap(array,start,middle);
                    start++;
                    middle++;
                    break;
                case 1:
                    middle++;
                    break;
                case 2:
                    swap(array,start,last);
                    last--;

            }
        }
    }

    private void swap(int array[],int first,int last){
         int temp = array[first];
         array[first] = array[last];
         array[last] = temp;
    }

    public static void main(String args[]){
        int array[] = {2,0,2,1,1,0};
        new DutchFlag().logic(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
