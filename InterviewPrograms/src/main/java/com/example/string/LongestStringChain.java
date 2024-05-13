package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class LongestStringChain {

    private void login(String [] words){
        Map<String,Integer> cache = new HashMap<>();
        int maxLength=0;
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (String word:words){
            // add current word in the cache
            cache.put(word,1);
            for (int i=0;i<word.length();i++){
                StringBuilder current = new StringBuilder(word);
                // deleting a character to check the that string value present in the cache
                String next = current.deleteCharAt(i).toString();
                // check first whether the next value calculated or not.
                if (cache.containsKey(next)){
                    // current word or next one was present in the cache or not for the next one add +1
                    cache.put(word,Math.max(cache.get(word),cache.get(next)+1));
                }
            }
            maxLength=Math.max(maxLength,cache.get(word));
        }
        log.info("maxValue:{}",maxLength);
    }

    public static void main(String [] args){
        String [] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        new LongestStringChain().login(words);
    }
}
