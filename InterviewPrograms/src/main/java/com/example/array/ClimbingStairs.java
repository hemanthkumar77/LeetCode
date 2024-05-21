package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClimbingStairs {
   private void logic(int n){
       int first=1;
       int second=2;
       for (int i=3;i<=n;i++){
           int third=first+second;
           first=second;
           second=third;
       }
       log.info("Steps:{}",second);
   }

   public static void main(String [] args){
       new ClimbingStairs().logic(3);
   }
}
