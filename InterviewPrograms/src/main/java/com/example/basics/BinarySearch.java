package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
     private void logic(int array[],int search){
          int low=0,high=array.length-1;
          int middle = 0;
          while (low<=high){
               middle = (low+high)/2;
               if(array[middle]==search){
                    log.info("value found in position:{}",middle+1);
                    break;
               }else if(array[middle]<search){
                    low = middle+1;
               }else {
                    high = middle-1;
               }
          }

        if(low>high){
             log.info("value not found in the sorted array");
        }
     }
     public static void main(String args[]){
          int array [] = {0, 2, 4, 6, 8, 10, 12, 14, 16};
          new BinarySearch().logic(array,10);
     }
}
