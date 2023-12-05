package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class Duplicates {
    private void logic(String word){
        HashSet<Character> hashSet = new HashSet<>();
        String data = word.replaceAll(" ","");
        for(char c:data.toCharArray()){
            if(hashSet.contains(c)){
                log.info("duplicate:{}",c);
            }else {
                hashSet.add(c);
            }
        }
    }
    public static void main(String[]args){
      new Duplicates().logic("Hemanth Kumar Kumar");
    }
}
