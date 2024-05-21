package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;

@Slf4j
public class KLargestElement {
    private void logic(int [] array,int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0;i<array.length;i++){
            // satisfy either of this two condition
            if (priorityQueue.size()<k|| array[i]>priorityQueue.peek()){
                priorityQueue.add(array[i]);
            }
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        log.info("KlargestElement:{}",priorityQueue.poll());
    }

    public static void main(String [] args){
        int [] array = {3,2,3,1,2,4,5,5,6};
        new KLargestElement().logic(array,4);
    }
}
