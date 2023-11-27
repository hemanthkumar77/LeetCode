package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class WordBreak {
    private void logic(String length,String []data){
        HashSet<String> hashSet = new HashSet<>();
        //initialize with 1
        boolean [] tracker =  new boolean[length.length()+1];
        tracker[0] = true;
        for(String val:data){
            hashSet.add(val);
        }
        for(int i=1;i<=length.length();i++){
            for(int j=0;j<i;j++){
                String dataValue = length.substring(j,i);
                if (tracker[j] && hashSet.contains(dataValue)){
                    tracker[i] = true;
                    break;
                }
            }
        }
        log.info("All Words Present:{}",tracker[length.length()]);
    }

    public static void main(String args[]){
        String [] words = {"cats","dog","sand","and","cat"};
        String word = "catsandog";
        new WordBreak().logic(word,words);
    }

}
