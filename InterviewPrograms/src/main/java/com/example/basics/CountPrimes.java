package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountPrimes {
   private void logic(int n){
       int limit= (int)Math.sqrt(n);
       boolean [] tracker = new boolean[n];
       // remember 0,1 are said to br non prime
       // iterate the value still the limit only
       for (int i=2;i<=limit;i++){
           if (tracker[i]==false){
               // step-1 remember you need set first the square of the i value as true.,
               // step-2 then make sure to increment the j value by adding i for everytime
               for (int j=i*i;j<n;j+=i){
                   tracker[j]=true;
               }
           }
       }
       int count=0;
       for(int i=2;i<n;i++){
           if (tracker[i]==false){
               count++;
           }
       }
       log.info("total number of primes:{}",count);
   }

   public static void main(String [] args){
       // 2,3,5,7,11,13,17,19 ( Sieve of Eratosthenes)
       new CountPrimes().logic(20);
   }
}
