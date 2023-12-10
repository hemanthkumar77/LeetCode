package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoveZeros {
   private void logic(int array[]){
     int nonZeroIndex =0;
     for(int i=0;i<array.length;i++){
         if(array[i]!=0){
             int temp = array[i];
             array[i] = array[nonZeroIndex];
             array[nonZeroIndex] = temp;
             nonZeroIndex++;
         }
     }
     for(int i=0;i<array.length;i++){
         System.out.print(array[i]+" ");
     }
   }
   public static void main(String args[]){
       int array [] = {0,1,0,3,12};
       new MoveZeros().logic(array);
   }
}
