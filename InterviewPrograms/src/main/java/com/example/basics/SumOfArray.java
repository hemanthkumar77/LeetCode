package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumOfArray {
  private void logic(int array[]){
       int sum=0;
       for(int i=0;i<array.length;i++){
           sum = sum + array[i];
       }
       log.info("sumOfArray:{}",sum);
  }

  private void runningSum(int array[]){
       for(int i=1;i<array.length;i++){
           array[i] = array[i-1]+array[i];
       }
       for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }
  }

  public static void main(String args[]){
      int array [] = {1,2,3,4};
      new SumOfArray().logic(array);
      new SumOfArray().runningSum(array);
  }
}
