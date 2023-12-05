package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
@Slf4j
public class LongestRepeatingCharacterReplacement {
    private void logic(String word,int k){
        int rightPointer=0;
        int leftPointer=0;
        char [] a = word.toCharArray();
        int maxFreq=0,maxLen=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        // moving the rightPointer for everyTime
        while(rightPointer<a.length){
            // checking and adding the char frequency in the hashMap
            hashMap.put(a[rightPointer],hashMap.getOrDefault(a[rightPointer],0)+1);
            maxFreq = Math.max(maxFreq,hashMap.get(a[rightPointer]));
            // len-maxFreq >k reduce the windows size and even decrease frequency count of the character
            // just move from the beginning of the word character
            if((rightPointer-leftPointer+1)-maxFreq>k){
                hashMap.put(a[leftPointer],hashMap.get(a[leftPointer])-1);
                leftPointer++;
            }
            maxLen = Math.max(maxLen,(rightPointer-leftPointer+1));
            rightPointer++;
        }
        log.info("maximumLength:{}",maxLen);
    }
    public static void main(String args[]){
        new LongestRepeatingCharacterReplacement().logic("AABABBA",1);
    }
}
