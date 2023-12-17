package com.example.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;

@Slf4j
public class PairOfIntegers {
   private void logic(int data[], int target) {
      HashSet<Integer> hashSet = new HashSet<>();
      for (int i = 0; i < data.length; i++) {
         int value = target - data[i];
         if (hashSet.contains(value)) {
            log.info("pair:({},{})", data[i], value);
         }
         hashSet.add(data[i]);
      }
   }
   public static void main(String args[]){
      int data[] = {2,7,11,15};
      new PairOfIntegers().logic(data,9);
   }
}
