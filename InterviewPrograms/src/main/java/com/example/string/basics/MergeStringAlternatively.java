package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeStringAlternatively {
   private void logic(String word1,String word2){
       int min = Math.min(word1.length(),word2.length());
       StringBuilder mergedString = new StringBuilder();
       for(int i=0;i<min;i++){
           mergedString.append(word1.charAt(i)).append(word2.charAt(i));
       }
       mergedString.append(word1.substring(min)).append(word2.substring(min));
       log.info("merged String:{}",mergedString);
   }

   public static void main(String args[]){
       String word = "abc";
       String word1 = "pqr";
       new MergeStringAlternatively().logic("abcd","pq");
   }
}
