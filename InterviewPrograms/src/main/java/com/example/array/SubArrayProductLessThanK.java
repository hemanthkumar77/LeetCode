package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubArrayProductLessThanK {
    private void operation(int [] nums,int k){
        int product = 1;
        int result =0;
        int rightPointer =0;
        int leftPointer =0;
        while (rightPointer<nums.length){
            // multiple with nums[rightPointer] as index
            product*= nums[rightPointer];
            // if the condition meets or exceeds we pop out the number back by dividing the current product value by the
            // nums[leftPointer] as index
            while (product>=k){
                product/=nums[leftPointer];
                leftPointer++;
            }
            result+= rightPointer-leftPointer+1;
            rightPointer++;
        }
        log.info("total subarray:{}",result);
    }

    public static void main(String args[]){
        int []nums = {1, 9, 2, 8, 6, 4, 3};
        new SubArrayProductLessThanK().operation(nums,100);
    }
}
