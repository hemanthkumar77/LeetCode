package com.example.basics;

import lombok.extern.slf4j.Slf4j;

import javax.sound.midi.SysexMessage;
import java.util.PriorityQueue;

@Slf4j
public class SquaresOfSortedArray {
  private void logic(int array[]){
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      for(int i=0;i<array.length;i++){
          array[i] = array[i] *array[i];
          priorityQueue.add(array[i]);
      }
      while (!priorityQueue.isEmpty()){
          System.out.print(priorityQueue.poll()+" ");
      }
  }
  public static void main(String args[]){
      int array[] = {-4,-1,0,3,10};
      new SquaresOfSortedArray().logic(array);
  }
}
