package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestPalindromeSubString {

    private void logic(String word){
        String palindromeSubstring = "";
        for (int i=0;i<word.length();i++){
            String odd = getPalindromeString(word,i,i);
            String even = getPalindromeString(word,i,i+1);
            if (palindromeSubstring.length()<odd.length()){
                palindromeSubstring=odd;
            }
            if (palindromeSubstring.length()<even.length()){
                palindromeSubstring=even;
            }
        }
        log.info("longest palindrome substring:{}",palindromeSubstring);
    }
    private String getPalindromeString(String word,int start,int end){
        while (start>=0 && end<word.length() && word.charAt(start)==word.charAt(end)){
            start--;
            end++;
        }
        return word.substring(start+1,end);
    }
    public static void main(String [] args){
        new LongestPalindromeSubString().logic("cbbd ");
    }
}
