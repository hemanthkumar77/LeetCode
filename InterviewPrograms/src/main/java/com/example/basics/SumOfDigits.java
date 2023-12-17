package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumOfDigits {
  private void logic(int value){
      int sum = 0;
      while(value!=0){
          int reminder  = value %10;
          sum = sum +reminder;
          value = value/10;
      }
      System.out.print("sum:"+sum);
  }
  public static void main(String args[]){
      new SumOfDigits().logic(567);
  }
}
