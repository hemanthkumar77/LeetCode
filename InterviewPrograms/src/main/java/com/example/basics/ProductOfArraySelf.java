package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductOfArraySelf {
  private void logic(int[] array) {
     int outputArray[] = new int[array.length];
     outputArray[0] = 1;
     // always remember this clearly the prefix starting point is always one
     for(int i=1;i<array.length;i++){
       outputArray[i] = array[i-1] * outputArray[i-1];
     }
     int R=1;
     for (int i=array.length-1;i>=0;i--){
        outputArray[i] = outputArray[i] * R;
        R = R * array[i];
     }

     for(int i=0;i<array.length;i++){
         System.out.print(outputArray[i]+" ");
     }
  }
  public static void main(String[] args){
      int array [] = {1,2,3,4};
      // left product [1,1,2,6] always the left product starts with 1
      // right product [24,12,4,1] always the end will start with 1
      // finally multiply both the right and left product
      new ProductOfArraySelf().logic(array);
  }
}
