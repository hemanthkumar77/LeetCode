package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EditDistance {

    private void getLogic(String word,String word2){
        int row = word.length();
        int column = word2.length();
        int [][]dp = new int[row+1][column+1];
        for (int i=1;i<=row;i++){
            dp[i][0]=i;
        }
        for(int j=1;j<=column;j++){
            dp[0][j]=j;
        }
        for (int i=1;i<=row;i++){
            for (int j=1;j<=column;j++){
                if (word.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    int topLeft = dp[i-1][j-1];
                    int left = dp[i][j-1];
                    int top=dp[i-1][j];
                    dp[i][j]=Math.min(topLeft,Math.min(left,top))+1;
                }
            }
        }
        log.info("EditDistance:{}",dp[row][column]);
    }

    public static void main(String [] args){
        new EditDistance().getLogic("horse","ros");
    }
}
