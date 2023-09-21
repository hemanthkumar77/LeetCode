package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxCircularSubArraySum {
    private void logic(int a[]){
        int max_value=0;
        int max=0;
        int min=0;
        int min_value=0;
        int totalValue=0;
        for(int i=0;i<a.length;i++){
            totalValue = totalValue +a[i];

            // find the max value
             max = Math.max(a[i],max+a[i]);
             max_value= Math.max(max,max_value);

            // find the min value
            min = Math.min(a[i],min+a[i]);
            min_value = Math.min(min_value,min);
        }

        if(max_value>0){
            log.info("max value circular sub array sum:{}",Math.max(max_value,totalValue-min_value));
        }else {
            log.info("max Value circular sub array sum:{}",max_value);
        }
    }

    public static void main(String []args){
        MaxCircularSubArraySum maxCircularSubArraySum = new MaxCircularSubArraySum();
        // negative case
        int a[] = {-2, -1, 5, -4, 3, -1, 3, -4, 1};

        maxCircularSubArraySum.logic(a);
    }

}
