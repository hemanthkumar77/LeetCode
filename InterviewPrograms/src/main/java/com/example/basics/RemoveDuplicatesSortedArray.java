package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveDuplicatesSortedArray {
  private void logic(int array[]){
      int index= 1;
      for(int i=0;i<array.length-1;i++){
          if(array[i]!=array[i+1]){
              array[index]=array[i+1];
              index++;
          }
      }
      for(int i=0;i<index;i++){
          System.out.print(array[i]+" ");
      }
  }
  public static void main(String []args){
      int array [] = {0,0,1,1,1,2,2,3,3,4};
      new RemoveDuplicatesSortedArray().logic(array);
  }
}
