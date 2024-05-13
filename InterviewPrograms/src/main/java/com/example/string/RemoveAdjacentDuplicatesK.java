package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveAdjacentDuplicatesK {
   private String logic(String word,int k){
       int count=1;
       for (int i=1;i<word.length();i++){
           if (word.charAt(i)==word.charAt(i-1)){
               count++;
           }else {
               count=1;
           }
           if (count==k){
               String updateString = word.substring(0,i-k+1)+word.substring(i+1);
               return logic(updateString,k);
           }
       }
       log.info("final string:{}",word);
    return word;
   }

   public static void main(String[] args){
       new RemoveAdjacentDuplicatesK().logic("pbbcggttciiippooaais",2);
   }
}
