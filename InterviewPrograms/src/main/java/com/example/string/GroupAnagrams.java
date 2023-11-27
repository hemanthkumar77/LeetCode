package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class GroupAnagrams {
    private void logic(String[] words) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String word : words) {
            char[] data = word.toCharArray();
            Arrays.sort(data);
            String sorted = new String(data);
            if (!hashMap.containsKey(sorted)){
                hashMap.put(sorted,new ArrayList<>());
            }
            hashMap.get(sorted).add(word);
        }
        for (Map.Entry holder: hashMap.entrySet()){
            log.info("value:{}",holder.getValue());
        }
    }

    public static void main(String[]args){
        String[]words = {"eat","tea","tan","ate","nat","bat"};
        new GroupAnagrams().logic(words);
    }
}
