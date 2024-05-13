package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class RemoveDuplicatesAdjacent {
   private void logic(String words){
       Stack<Character> stack = new Stack<>();
       for (char c:words.toCharArray()){
           if (!stack.empty() && stack.peek()==c){
               stack.pop();
           }else {
               stack.push(c);
           }
       }
       StringBuilder stringBuilder = new StringBuilder();
       while (!stack.isEmpty()){
           stringBuilder.append(stack.pop());
       }
       log.info("Value:{}",stringBuilder.reverse().toString());
   }

   public static void main(String [] args){
      new RemoveDuplicatesAdjacent().logic("azxxzy");
   }
}
