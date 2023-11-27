package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class WordPattern {
    private boolean logic(String pattern, String words) {
        String[] wordDetails = words.split(" ");
        if (pattern.length() != wordDetails.length) return false;
        HashMap<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < wordDetails.length; i++) {
            char keyHolder = pattern.charAt(i);
            // first check the character present in the key
            if (hashMap.containsKey(keyHolder)) {
                // second suppose if the character present but the word is not matching with character
                if (!hashMap.get(keyHolder).equals(wordDetails[i])) {
                    return false;
                }
            } else {
                // finally the word already present for different character that means break and return false
                if (hashMap.containsValue(wordDetails[i])) {
                    return false;
                }
                hashMap.put(keyHolder, wordDetails[i]);
            }
        }
        return true;
    }

    public static void main(String[]args){
       boolean val= new WordPattern().logic("abba","dog cat cat dog");
      log.info(val ? "pattern matching is perfect":"pattern does not match");
    }
}
