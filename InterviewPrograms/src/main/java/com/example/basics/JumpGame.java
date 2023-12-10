package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JumpGame {
   private void logic(int [] array){
       int lastIndex = array.length-1;
       // index_position + array[index_position] > lastIndex
       for(int i=array.length-1;i>=0;i--){
           if((i+array[i]>=lastIndex)){
               lastIndex = i;
           }
       }
       log.info("jumpGame:{}",lastIndex==0);
   }
   public static void main(String args[]){
       int array [] = {3,2,1,0,4};
       new JumpGame().logic(array);
   }
}
