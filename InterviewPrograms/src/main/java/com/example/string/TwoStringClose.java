package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class TwoStringClose {
   private boolean logic(String word1,String word2){
       int word1Freq [] = getFrequencies(word1);
       int word2Freq[] = getFrequencies(word2);

       HashMap<Integer,Integer> hashMap = new HashMap<>();

     // step-1 check whether all the character in word 1 is present in the word2
     for(int i=0;i<26;i++){
         if((word1Freq[i]!=0 && word2Freq[i]==0)||(word1Freq[i]==0 && word2Freq[i]!=0)){
             return false;
         }
     }

       for(int fre:word1Freq){
           // here hashMap key is the frequency of the element in the words
           // hashMap character frequency number and the value is going to contain the frequency number occurrence
           hashMap.put(fre,hashMap.getOrDefault(fre,0)+1);
       }

       // compare whether the frequency of the character occurrence is equal in both words.
     for (int i:word2Freq){
         if(!hashMap.containsKey(i)){
             return false;
         }
         hashMap.put(i,hashMap.get(i)-1);
         if(hashMap.get(i)==0){
             hashMap.remove(i);
         }
     }

     return hashMap.size()==0;
   }

   private int[] getFrequencies(String word){
       int fre[] = new int[26];
       for(char val:word.toCharArray()){
           fre[val-'a']++;
       }
       return fre;
   }

  public static void main(String args[]){
       // first check whether the char is commonly present in the both string
      // second keep the character frequency number as key and occurrence as the value
    log.info("TwoStringsAreClose:{}",new TwoStringClose().logic("cabbba","abbccc"));
  }
}
