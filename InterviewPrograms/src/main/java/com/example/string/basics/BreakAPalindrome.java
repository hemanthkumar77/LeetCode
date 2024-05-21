package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BreakAPalindrome {
   private String breakPalindrome(String value){
       char[]val = value.toCharArray();
       for (int i=0;i<val.length/2;i++) {
           // Step-1: try to replace a single character with 'a' to break a palindrome, consider only the first half length
           if (val[i] != 'a') {
               val[i] = 'a';
               return String.valueOf(val);
           }
       }
       // in other edge case if first half as only the complete "a" character then replace at the end with "b" character to break palindrome
       val[val.length-1]='b';
       return String.valueOf(val);
   }

   public static void main(String[]args){
     log.info("Break a palindrome:{}", new BreakAPalindrome().breakPalindrome("abccba"));
   }
}
