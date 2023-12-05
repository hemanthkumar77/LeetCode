package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;

@Slf4j
public class SubSets {
    private void logic(String word){
        HashSet<String> hashSet = new HashSet<>();
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                hashSet.add(word.substring(i,j));
            }
        }
        hashSet.forEach(log::info);
    }

    private void recursion(String word,String split){
        if(word.length()==0){
            log.info(split);
        }
        recursion(word.substring(1),split+word.charAt(0));
        recursion(word.substring(1),split);
    }

    public static void main(String[]args){
        new SubSets().recursion("abc"," ");
    }
}
