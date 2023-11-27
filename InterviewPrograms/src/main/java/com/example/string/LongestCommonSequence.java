package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestCommonSequence {
   private void logic(String text1,String text2){
       int [][] Dp = new int[text1.length()+1][text2.length()+1];
       for (int i=1;i<Dp.length;i++){
           for(int j=1;j<Dp[0].length;j++){
               if(text1.charAt(i-1)==text2.charAt(j-1)){
                   Dp[i][j]= 1+Dp[i-1][j-1];
               }else {
                   Dp[i][j] = Math.max(Dp[i][j-1],Dp[i-1][j]);
               }
           }
       }
       log.info("LongestCommonSequence:{}",Dp[text1.length()][text2.length()]);
   }

   public static void main(String []args){
       String text1= "AGGTAB";
       String text2= "GXTXAYB";
       new LongestCommonSequence().logic(text1,text2);
   }
}
