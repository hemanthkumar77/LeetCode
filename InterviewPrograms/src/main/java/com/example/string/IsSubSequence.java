package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsSubSequence {
    private void logic(String data1, String data2) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < data1.length() && pointer2 < data2.length()) {
            if (data1.charAt(pointer1) == data2.charAt(pointer2)) {
                pointer1++;
                pointer2++;
            } else {
                pointer2++;
            }
        }
        if (pointer1 == data1.length())
            log.info("it is subsequence");
        else
            log.info("It is not subSequence");
    }

    public static void main(String args[]){
        new IsSubSequence().logic("abc","ahbgdc");
        String value= "abc";
    }
}
