package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class DailyTemp {
   private void logic(int [] array){
       // store only the index of the array in the stack
       // stack will have the highest temperature value index
       Stack<Integer> stack = new Stack<>();
       int [] distance= new int[array.length];
       for (int current=array.length-1;current>=0;current--){
           // check whether the current day temperature is greater than  stack higher temp
           while (!stack.isEmpty() && array[current]>=array[stack.peek()]){
               stack.pop();
           }
           if (!stack.isEmpty()){
               // store the distance by sub the high temperature index stored in stack (peek) - current index
               distance[current]= stack.peek() - current;
           }
           stack.push(current);
       }
       log.info("Value:{}",distance);
   }

   public static void main(String [] args){
       int [] array = {73,74,75,71,69,72,76,73};
       new DailyTemp().logic(array);
   }
}
