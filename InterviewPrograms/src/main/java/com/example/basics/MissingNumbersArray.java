package com.example.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MissingNumbersArray {
    public void logic(int array[], int array2[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        holder(array,hashMap);
        holder(array2,hashMap);
        for(Map.Entry entry:hashMap.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    private void holder(int[] array,HashMap<Integer,Integer>hashMap){
        for(int val:array){
            hashMap.put(val,hashMap.getOrDefault(val,0)+1);
        }
    }

    public static void main(String[]args){
        int array[] = {7,2,5,4,6,3,5,3};
        int array2[] = {7,2,5,3,5,3};
        new MissingNumbersArray().logic(array,array2);
    }
}
