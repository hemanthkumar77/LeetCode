package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LengthOfLastWord {
    private void logic (String data){

        int rightPointer = data.length()-1;
        while (rightPointer >=0 && data.charAt(rightPointer)==' '){
             rightPointer--;
        }
        int leftPointer = rightPointer;
        while (leftPointer >=0 && data.charAt(leftPointer)!=' '){
            leftPointer--;
        }
       log.info("length of the last word:{}",rightPointer-leftPointer);
    }

    public static void main(String[]args){
        new LengthOfLastWord().logic("   fly me   to   the moon  ");
    }
}
