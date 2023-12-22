package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class StringCompression {
     private void logic(String data){
         HashMap<Character,Integer> hashMap = new HashMap<>();
         StringBuilder stringBuilder = new StringBuilder();
         for(int i=0;i<data.length();i++){
             char va = data.charAt(i);
             hashMap.put(va,hashMap.getOrDefault(va,0)+1);
         }
         for(Map.Entry entry:hashMap.entrySet()){
             stringBuilder.append(entry.getKey()).append(entry.getValue());
         }
         log.info("Compressed:{}",stringBuilder);
     }

     private void logicString(char data[]){
         HashMap<Character,Integer> hashMap = new HashMap<>();
         StringBuilder stringBuilder = new StringBuilder();
         for(int i=0;i<data.length;i++){
             hashMap.put(data[i],hashMap.getOrDefault(data[i],0)+1);
         }
         for(Map.Entry entry:hashMap.entrySet()){
             stringBuilder.append(entry.getKey()).append(entry.getValue());
         }
         log.info("Compressed:{}",stringBuilder);
     }

     public static void  main(String args[]){
         char data [] = {'a','a','b','b','c','c','c'};
         new StringCompression().logicString(data);
     }
}
