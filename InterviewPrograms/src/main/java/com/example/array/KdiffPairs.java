package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
@Slf4j
public class KdiffPairs {
    public void optimizedSolution(int [] nums,int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int counter=0;
        for(int i:nums){
            hashMap.put(i, hashMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> value:hashMap.entrySet()){
           if(k==0){
               if(value.getValue()>=2){
                   counter++;
               }
           }
            log.info("value:{}",value.getValue());
           if(hashMap.containsKey(value.getKey()+k)){
               counter++;
           }
        }
        log.info("how many pairs :{}",counter);
    }

    public static void main(String args[]){
        int[]nums = {3,1,4,1,5};
        new KdiffPairs().optimizedSolution(nums,2);
    }
}
