package com.example.array;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GasStation {
    // only circuit can be completed in the gas station if position(gas-cost) is positive
   private int logic(int [] gas,int [] cost){
       int position=0;int sum=0;int total=0;
       for (int i=0;i<gas.length;i++){
           // please track the sum for all the trip
           sum+=gas[i]-cost[i];
           if (sum<0){
               total+=sum;
               sum=0;
               // spike might occur in the next calculation
               position=i+1;
           }
           // calculate the total sum for all case positive and negative
           total+=sum;
       }
       // if the total is positive then return the position where the circuit can be started
       return total>=0?position:-1;
   }

   public static void main(String [] args){
       int [] gas = {1,2,3,4,5};
       int [] cost = {3,4,5,1,2};
   log.info("Circuit can be started:{}",new GasStation().logic(gas,cost));
   }
}
