package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class LargestSubArraySumZero {
    private void optimized(int[] nums) {
        int curSum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // In this we are storing the curSum value along with index in the hashMap
        // if the curSum value already exist in the hashMap then get the index position
        // and substract from the current index value which is iterating
        for (int i = 0; i < nums.length; i++) {
            curSum = curSum + nums[i];
            if (curSum == 0) {
                // condition is applicable if your getting zero while adding 0+1 index
                maxLen = i + 1;
            } else if (hashMap.containsKey(curSum)) {
                maxLen = Math.max(maxLen, i - hashMap.get(curSum));
            } else {
                // store the curSum as the key along with index value
                hashMap.put(curSum, i);
            }
        }
        log.info("longest subarray sum:{}", maxLen);
    }

    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        new LargestSubArraySumZero().optimized(nums);
    }
}
