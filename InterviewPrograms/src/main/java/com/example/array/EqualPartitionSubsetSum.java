package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class EqualPartitionSubsetSum {
   private boolean logic(int array[]){
       int sum = Arrays.stream(array).sum();
       if(sum %2!=0) return false;
       int target = sum/2;
       boolean [] tracker = new boolean[target+1];
       tracker[0] = true;
       // make sure the iteration of the array happens from 0 to array.length-1
       // but the tracker iteration needs to happen from tracker.length-1 to 1
       // because you need to check the cur value is greater than the array[i] everytime.then only you can subtract
       for(int i=0;i<array.length;i++){
           for(int cur= tracker.length-1;cur>=1;cur--){
               if(cur>=array[i]){
                   tracker[cur] = tracker[cur] || tracker[cur-array[i]];
               }
           }
       }
       return tracker[target];
   }

   public static void main(String args[]){
       int array[] = {1,5,11,5};
      log.info("EqualPartitionSubsetSum:{}",new EqualPartitionSubsetSum().logic(array));
   }
}
