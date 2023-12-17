package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchElementRoatedArray {
    private void logic(int array[],int k){
        int low =0;
        int high=array.length-1;
        int mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if (array[mid]==k){
                log.info("element found in the position:{}",mid);
               break;
            }
            // left one is sorted
            if(array[low]<=array[mid]){
                // if this condition is satisfied means the value lies in the first half
                if(array[low]<= k && k<=array[mid]){
                    // so set the search from the low to mid-1
                    high = mid-1;
                }else {
                    // if the codition never meet then you need to start the search from mid+1 to high
                    low = mid+1;
                }
                // right element is sorted
            }else if(array[mid]<=array[high]){
                // the element value lies between the mid to high second half
                if(array[mid]<=k && k<=array[high]){
                  // then begin the search from mid+1 to high
                    low = mid+1;
                }else {
                    //then begin the search from the low to mid-1
                    high = mid-1;
                }
            }
        }

    }

    public static void main(String args[]){
        int array [] = {4,5,6,7,0,1,2};
        // https://leetcode.com/problems/search-in-rotated-sorted-array/  refer test cases.
        new SearchElementRoatedArray().logic(array,0);
    }
}
