package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class SubArraySumEqualsToK {
    private void bruteForce(int [] nums,int k){
        int counter =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    counter++;
                }
            }
        }
        log.info("totalCount value:{}",counter);
    }

    public void optimizedSolution(int [] nums,int k){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int curSum =0,counter=0;
        // a point where the sum-k will be zero so that is the reason we have it here initial
        hashMap.put(0,1);
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            if(hashMap.containsKey(curSum-k)){
                counter+= hashMap.get(curSum-k);
            }
            hashMap.put(curSum,hashMap.getOrDefault(curSum,0)+1);
        }
        log.info("totalCount value:{}",counter);
    }

    public static void main(String args[]){
        int [] nums = {10, 2, -2, -20, 10};
        //new SubArraySumEqualsToK().bruteForce(nums,-10);
        new SubArraySumEqualsToK().optimizedSolution(nums,-10);
    }
}
