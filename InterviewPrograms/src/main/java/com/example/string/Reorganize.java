package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Slf4j
public class Reorganize {
    private void logic(String word){
        Map<Character,Integer> map = new HashMap<>();
        for (char val:word.toCharArray()){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        priorityQueue.addAll(map.keySet());
        StringBuilder stringBuilder = new StringBuilder();
        while (priorityQueue.size()>1){
            char current = priorityQueue.remove();
            char next = priorityQueue.remove();
            stringBuilder.append(current);
            stringBuilder.append(next);
            map.put(current,map.get(current)-1);
            map.put(next,map.get(next)-1);
            if (map.get(current)>0){
                priorityQueue.add(current);
            }
            if (map.get(next)>0){
                priorityQueue.add(next);
            }
        }
        String val="";
        if (!priorityQueue.isEmpty()){
            char va = priorityQueue.remove();
            if (map.get(va)>1){
                log.info("String value:{}",val);
            }
            stringBuilder.append(va);
        }
        log.info("Reorganize String:{}",stringBuilder);
    }

    public static void main(String [] args){
        new Reorganize().logic("aaabc");
    }
}
