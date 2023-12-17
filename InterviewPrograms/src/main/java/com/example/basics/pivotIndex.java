package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class pivotIndex {
   private void logic(int array[]){
      int totalSum=0;
      for(int i=0;i<array.length;i++){
         totalSum= totalSum+array[i];
      }
      int leftSum=0;
      for(int i=0;i<array.length;i++){
         // never calculate the current array[i] value in the leftsum
         if(i!=0) leftSum+=array[i-1];
         if((totalSum-leftSum-array[i])==leftSum){
            log.info("pivotIndex value:{}",i);
         }
      }
   }
   public static void main(String []arrays){
      int array[] = {1,7,3,6,5,6};
      new pivotIndex().logic(array);
   }
}
