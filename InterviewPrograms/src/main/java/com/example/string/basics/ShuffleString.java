package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

@Slf4j
public class ShuffleString {
    private void logic(char [] chars,int [] numbers){
      char [] b = new char[numbers.length];
      for (int i=0;i<numbers.length;i++){
          b[numbers[i]]=chars[i];
      }
      log.info("value:{}",new String(b));
    }

    public static void main(String [] args){
        char [] chars = "codeleet".toCharArray();
        int [] numbers ={4,5,6,7,0,2,1,3};
        new ShuffleString().logic(chars,numbers);
    }
}
