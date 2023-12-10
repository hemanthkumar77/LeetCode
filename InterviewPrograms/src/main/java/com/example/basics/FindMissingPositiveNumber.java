package com.example.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class FindMissingPositiveNumber {
    private void logic(int[]array){
        HashSet<Integer> hashSet = new HashSet<>();
        for( int i=0;i<array.length;i++){
            hashSet.add(array[i]);
        }
        for(int i =1;i<=array.length;i++){
            if(!hashSet.contains(i)){
                log.info("first positive number:{}",i);
            }
        }
    }
    public static void main(String []args){
        int array [] = {3,4,-1,1};
        new FindMissingPositiveNumber().logic(array);
    }
}
