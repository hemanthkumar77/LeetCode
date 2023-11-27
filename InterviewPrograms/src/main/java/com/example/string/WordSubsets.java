package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class WordSubsets {
    private void logic(String []data1,String []data2){
        List<String> dataList = new ArrayList<>();
        int [] maxFrequencies = new int[26];
        for (String value:data2){
            int [] frequencies = new int[26];
            maxFrequencies = getCharCount(value);
            for(int i=0;i<26;i++){
                maxFrequencies[i] = Math.max(maxFrequencies[i],frequencies[i]);
            }
        }
        for (String value:data1){
            int [] freq= getCharCount(value);
            boolean valid = true;
            for(int i=0;i<26;i++){
                if(maxFrequencies[i]>freq[i]){
                    valid =false;
                    break;
                }
            }
            if(valid)dataList.add(value);
        }
        dataList.stream().forEach(log::info);
    }

    private int[] getCharCount(String data){
        int []freq= new int[26];
        for(char val:data.toCharArray()){
            freq[val-'a']++;
        }
        return freq;
    }

    public static void main(String args[]){
        String [] A = {"amazon","apple","facebook","google","leetcode"};
        String [] B = {"ec","oc","ceo"};
        new WordSubsets().logic(A,B);
    }
}
