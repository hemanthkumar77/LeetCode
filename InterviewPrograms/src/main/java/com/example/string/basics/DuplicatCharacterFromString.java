package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class DuplicatCharacterFromString {
    private void logic(String word){
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(char val:word.toCharArray()){
            if(!hashSet.contains(val)){
                stringBuilder.append(val);
                hashSet.add(val);
            }
        }
        log.info("value:{}",stringBuilder.toString());
    }

    public static void main(String []args){
        new DuplicatCharacterFromString().logic("hemanth");
        String data = "abc";
        log.info(data.substring(1));
        log.info("{}",data.charAt(0));
    }
}
