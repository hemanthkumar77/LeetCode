package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaveArray {
  private void logic(int array[]){
      for(int i=0;i<array.length;i=i+2){
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
      }
      for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
      }
  }
  public static void main(String args[]){
    int array [] = {1, 2, 3, 4};
    new WaveArray().logic(array);
  }
}
