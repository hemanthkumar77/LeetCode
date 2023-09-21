package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kandanes {
    private void  OptimizedSolution(int []nums){
        int curSum=0,maxSum=0;
        for(int i=0;i<nums.length;i++){
            curSum = Math.max(nums[i],curSum+nums[i]);
            maxSum = Math.max(curSum,maxSum);
        }
        log.info("Max SubArray Sum:{}",maxSum);
    }

    private void bruteForce(int [] nums){
        int curSum=0,maxSum=0;
        for(int i=0;i<nums.length;i++){
            curSum =0;
            for(int j=i;j<nums.length;j++){
                curSum+=nums[j];
                if(curSum>maxSum){
                    maxSum = curSum;
                }
            }
        }
        log.info("max SubArray Sum:{}",maxSum);
    }
    public static void main(String args[]){
        int [] nums ={-2, -3, 4, -1, -2, 1, 5, -3};
        //
        // new Kandanes().OptimizedSolution(nums);
        new Kandanes().bruteForce(nums);
    }
}
