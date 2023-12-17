package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinimumRotatedArray {
  private void logic(int array[]){
      int low=0,high=array.length-1;
      int mid=0;
      int ans=Integer.MAX_VALUE;
      while (low<=high){
          mid = (low+high)/2;
          // if the elements sorted completely then use the least value
          if(array[low]<=array[high]){
              ans = Math.min(ans,array[low]);
              break;
          }
          // checking whether the left half first value is less than the middle value
          if(array[low]<=array[mid]){
               ans = Math.min(ans,array[low]);
               low=mid+1;
          }else if(array[mid]<=array[high]){
              // checking whether the right half last value is greater than the middle value
              high = mid-1;
              ans = Math.min(ans,array[mid]);
          }
      }
      log.info("minimum rotated array:{}",ans);
  }

  public static void main(String arsg[]){
      int array[] = {4,5,6,7,0,1,2};
      new MinimumRotatedArray().logic(array);
  }
}
