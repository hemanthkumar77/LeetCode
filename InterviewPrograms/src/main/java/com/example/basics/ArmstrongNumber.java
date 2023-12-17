package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArmstrongNumber {
   private void logic(int number){
       int power=0;
       int original = number;
       int sum=0;
       while(number!=0){
           number = number / 10;
           power++;
       }
       while (original!=0){
           int reminder = original %10;
           sum = (int) (sum + Math.pow(reminder,power));
           original = original/10;
       }
       System.out.print("sum:"+sum);
   }

   public static void main(String args[]){
       new ArmstrongNumber().logic(153);
   }
}
