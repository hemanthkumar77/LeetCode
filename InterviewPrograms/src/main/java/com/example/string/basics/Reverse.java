package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Reverse {

    private void logic(int n,String correct,String reverse){
        if(n>=0){
            reverse = reverse+correct.charAt(n);
            n--;
            logic(n,correct,reverse);
        } else {
            log.info("reverseWord:{}",reverse);
        }
    }

    public static void main(String []args){
        String correct = "hemanth";
        String reverse = "";
        new Reverse().logic(correct.length()-1,correct,reverse);
    }
}
