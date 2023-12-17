package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwapElements {
   private void logic(int a ,int b){
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.print("a:"+a+","+"b:"+b);
   }
   public static void main(String args[]){
       new SwapElements().logic(10,18);
   }
}
