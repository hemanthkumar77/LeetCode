package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class NonRepeatedCharacter {

    private void logic(String word){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char val:word.toCharArray()){
            hashMap.put(val,hashMap.getOrDefault(val,0)+1);
        }
        for(char val:word.toCharArray()){
            if(hashMap.get(val)==1){
                log.info("first non repeated character:{}",val);
                break;
            }
        }
    }

    public static void main(String []args){
        new NonRepeatedCharacter().logic("geeksforgeeks");
    }

}
