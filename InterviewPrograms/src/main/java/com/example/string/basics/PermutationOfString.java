package com.example.string.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PermutationOfString {
  private void logic(String input,String result){
       if(input.length()==0){
           log.info(result);
           return;
       }
       // used the tracker to avoid the repeated character print
       boolean [] tracker = new boolean[26];
       for(int i=0;i<input.length();i++){
           char value = input.charAt(i);
           // make sure your excluding that character from the string
           String resultVal = input.substring(0,i)+input.substring(i+1);
           if(tracker[value-'a']==false){
               logic(resultVal,result+value);
               tracker[value-'a'] = true;
           }
       }
  }

  public static void main(String args[]){
      new PermutationOfString().logic("abcd"," ");
  }
}
