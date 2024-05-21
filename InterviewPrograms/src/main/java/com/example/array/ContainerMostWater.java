package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContainerMostWater {
   private void logic(int [] height){
       int left=0;int right=height.length-1;int waterLimit=0;
       // height[i] value is consider as height which is the y-axis, length of the height array is consider as x-axis 0-height[].length-1
       while (left<right){
        // left 0 and right will be height[].length-1 calculate the distance means right-left
           int distance_between_leftPointer_rightPointer=right-left;
           // waterLimit is the capacity means ,(distance_between_leftPointer_rightPointer) distance * Minimum height of left pointer or right pointer
           waterLimit=Math.max(waterLimit,Math
                   .min(height[left],height[right])*(distance_between_leftPointer_rightPointer));
           // move the pointer towards the max height value
           if (height[left]>height[right]){
               right--;
           }else {
               left++;
           }
       }
       log.info("maxLimit:{}",waterLimit);
   }

   public static void main(String [] args){
       int [] height = {3, 1, 2, 4, 5};
       new ContainerMostWater().logic(height);
   }
}
