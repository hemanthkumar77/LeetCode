package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class MergeIntervals {
    private void logic(int data[][]){
        Arrays.sort(data, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> resultList = new ArrayList<>();
        int [] newIntervals = data[0];
        resultList.add(newIntervals);
        for(int [] interval:data){
            if(interval[0]<=newIntervals[1]){
                // example compare the [2,4](interval) <= [1,3](new interval)   interval(0th position) 2<=3 (new interval 1st position)
                // if this satisfies update the first element in the new interval by comparing it
                newIntervals[1] = Math.max(newIntervals[1],interval[1]);
            }else {
                // if the above condition that not meet then you need add to the list directly
                newIntervals = interval;
                resultList.add(newIntervals);
            }
        }
        int [][] finalResult = resultList.toArray(new int[resultList.size()][]);
        for( int i =0;i<=data[0].length;i++){
            System.out.print(Arrays.toString(finalResult[i]));
        }
    }
    public static void main(String args[]){
        int [][] array = {{1,3},{2,4},{6,8},{9,10}};
        // output : [[1,4],[6,8],[9,10]]
        new MergeIntervals().logic(array);
    }
}
