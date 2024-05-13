package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FindReplaceString {
  private void logic(String word,int [] indexes,String [] sources,String [] target){
            Map<Integer,Integer>cache = new HashMap<>();
            for (int i=0;i<indexes.length;i++){
                // first check in the word string starting with char position word.charAt(indexes[i]) as the source[i] value or not
                if (word.startsWith(sources[i],indexes[i])){
                    // keep key as the indexes[i] and value as the ith place
                    // key is going has the character position of the word which needs to replace, value going to consist of the ith index which is going to get value from the target , and source value to calculate length
                    cache.put(indexes[i],i);
                }
            }
            int i=0;
      StringBuilder stringBuilder = new StringBuilder();
       while(i<word.length()){
           //
           if (cache.containsKey(i)){
               stringBuilder.append(target[cache.get(i)]);
               i+=sources[cache.get(i)].length();
           }else {
               stringBuilder.append(word.charAt(i));
               i++;
           }
       }
       log.info("FinalValue:{}",stringBuilder.toString());
  }

  public static void main(String [] args){
     int [] indexes = {0, 2};
     String [] sources = {"a", "cd"};
     String [] target = {"eee","ffff"};
     new FindReplaceString().logic("abcd",indexes,sources,target);
  }
}
