package com.example.basics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Factorial {
    private void logic(int data, int n) {
        if (n > 0) {
            data = data * n;
            n--;
            logic(data,n);
        }else {
            System.out.print("fact:"+data);
        }
    }

    public static void main(String args[]){
        new Factorial().logic(1,7);
    }
}
