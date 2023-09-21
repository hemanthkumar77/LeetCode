package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;

@Slf4j
public class FindAllMissingNumbers {

    private void normalOperation(int[] nums) {
        int[] appeared = new int[nums.length+1];
        for (int i : nums) {
            appeared[i]++;
        }
        for (int i = 1; i < nums.length+1; i++) {
            if (appeared[i] == 0) {
                System.out.print(i + ",");
            }
        }
    }

    private void optimized(int [] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            hashSet.add(i);
        }
        for(int i=1;i<nums.length;i++){
            if(!hashSet.contains(i)){
                System.out.print(i);
            }
        }
    }

    private void sortedArray(int [] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for( int i:nums){
            hashSet.add(i);
        }
        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(!hashSet.contains(i)){
                System.out.print(i);
            }
        }
    }
    public static void main(String[]args){
        // find all missing number in the unsorted array
        int nums[] ={4,3,2,7,8,2,3,1};

        // find all missing number for the sorted array
        int nums2[] = {6, 7, 10, 11, 13};

        //new FindAllMissingNumbers().normalOperation(nums);
        //new FindAllMissingNumbers().optimized(nums);
        new FindAllMissingNumbers().sortedArray(nums2);
    }
}
