package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MoveNegativeElementsToCorner {
    private void logic(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (i != j) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                j++;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[]args){
        int array [] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        new MoveNegativeElementsToCorner().logic(array);
    }
}
