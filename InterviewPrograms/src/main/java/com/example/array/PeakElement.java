package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeakElement {
   private void logic(int array[]){
       int low=0;
       int high=array.length-1;
       while (low<high){
           int mid = low+(high-low)/2;
           if (array[mid]>array[mid+1]){
               high=mid;
           }else {
               low=mid+1;
           }
       }
       log.info("low:{}",low);
   }

   public static void main(String[] args){
       int [] array= {1,2,3,1};
       new PeakElement().logic(array);
   }
}
