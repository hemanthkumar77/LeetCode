package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlusOne {
  private void logic(int value[]) {
    int sum = 0;
    int holder=0;
    int plusOne = 1;
    int counter = value.length-1;

    while (holder<value.length){
      sum = sum *10+value[holder];
      holder++;
    }
    sum++;

    while (counter >= 0) {
      int reminder = sum % 10;
      value[counter] = reminder;
      sum = sum / 10;
      counter --;
    }
    for (int i = 0; i < value.length; i++) {
      System.out.print(value[i] + " ");
    }
  }

  public static void main(String args[]){
    int array [] = {1,2,3};
    new PlusOne().logic(array);
  }
}
