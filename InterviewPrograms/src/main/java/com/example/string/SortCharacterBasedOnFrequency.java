package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.PriorityQueue;

@Slf4j
public class SortCharacterBasedOnFrequency {
    private void logic(String word){
        char[] chars = word.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char val:chars){
            hashMap.put(val,hashMap.getOrDefault(val,0)+1);
        }
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a,b)->hashMap.get(b)- hashMap.get(a));
        priorityQueue.addAll(hashMap.keySet());
        StringBuilder stringBuilder = new StringBuilder();
        while (!priorityQueue.isEmpty()){
            char val = priorityQueue.remove();
            for(int i=0;i<hashMap.get(val);i++){
                stringBuilder.append(val);
            }
        }
        log.info("result:{}",stringBuilder);
    }

    public static void main(String args[]){
        new SortCharacterBasedOnFrequency().logic("Bully");
    }
}
