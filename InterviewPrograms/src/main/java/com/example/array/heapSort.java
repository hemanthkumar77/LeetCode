package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;

@Slf4j
public class heapSort {
    private void operation(int a[]){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            minheap.add(a[i]);
        }
        for(int i=0;i<a.length;i++) {
            if (!minheap.isEmpty()) {
                a[i] = minheap.poll();
            }
        }
        log.info("sorted array values:{}");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String []args){
        int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        heapSort obj = new heapSort();
        obj.operation(a);
    }
}
