package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Anagrams {
    private int[] calculate(String word){
        int[]frequencies = new int[26];
        for(char c:word.toCharArray()){
            frequencies[c-'a']++;
        }
        return frequencies;
    }
    public static void main(String[]args){
       int[] firstWord=new Anagrams().calculate("anagram");
       int[] secondWord= new Anagrams().calculate("nagaram");
       boolean valid=true;
       for (int i=0;i<26;i++){
           if(firstWord[i]!=secondWord[i]){
               valid = false;
           }
       }
       if(valid){
            log.info("words are anagram");
       }else {
           log.info("words are not anagram");
       }
    }
}
