package com.example.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DisappearedNumber {
  private void logic(int a[]){
      int index =0;
      List<Integer> result = new ArrayList<>();
      for(int i=0;i<a.length;i++){
          index = Math.abs(a[i])-1;
          if(a[index]<0){
              continue;
          }
          a[index] *= -1;
      }
      for(int i=0;i<a.length;i++){
          if(a[i]>0){
              result.add(i+1);
          }
      }
      result.forEach(data->log.info(String.valueOf(data)));
  }

  public static void main(String args[]){
      int array[] = {4,3,2,7,8,2,3,1};
      new DisappearedNumber().logic(array);
  }
}
