package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class IsomorphicString {
   private boolean logic(String data,String value){
       HashMap<Character,Character> hashMap = new HashMap<>();
       for (int i=0;i<data.length();i++){
           char key = data.charAt(i);
           char da = value.charAt(i);
           if(!hashMap.containsKey(key)){
               if(!hashMap.containsValue(value)){
                  hashMap.put(key,da);
               }else {
                   return false;
               }
           }else {
               char mapChar = hashMap.get(key);
               if(mapChar!=da){
                   return false;
               }
           }
       }
       return true;
   }

   public static void main(String args[]){
       String data = "paper";
       String value = "title";
      log.info("Isomorphic string:{}",new IsomorphicString().logic(data,value));
   }
}
