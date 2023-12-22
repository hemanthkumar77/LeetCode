package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxConsecutiveOnes {
   private void logic(int array[]){
       int max=0;
       int counter=0;
       for(int i=0;i<array.length;i++){
           if(array[i]==1){
               counter++;
           }else {
               counter =0;
           }
           max = Math.max(max,counter);
       }
       log.info("MaxConsecutiveOne's:{}",max);
   }

   public static void main(String []args){
       int array[] = {1,1,0,1,1,1};
       new MaxConsecutiveOnes().logic(array);
   }
}
