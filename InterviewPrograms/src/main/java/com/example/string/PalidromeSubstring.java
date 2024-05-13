package com.example.string;

import com.example.string.basics.PermutationOfString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PalidromeSubstring {
    public void logic(String word){
        int count=0;
      for (int i=0;i<word.length();i++){
        count+=getPalindrome(word,i,i)+getPalindrome(word,i,i+1);
      }
      log.info("total substring:{}",count);
    }

    private int getPalindrome(String word,int start,int last){
        int count=0;

            while (start>=0 && last<word.length() && word.charAt(start)==word.charAt(last)){
                start--;
                last++;
                count++;
            }
        return count;
    }

    public static void main(String [] args){
        new PalidromeSubstring().logic("aaa");
    }
}
