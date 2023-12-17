package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class DecodeString {
  private void logic(String value) {
    int index = 0;
    Stack<Integer> integerStack = new Stack<>();
    Stack<String> stringStack = new Stack<>();
    String res = "";
    while (index < value.length()) {
      if (Character.isDigit(value.charAt(index))) {
        int count = 0;
        while (Character.isDigit(value.charAt(index))) {
          count = count * 10 + (value.charAt(index)-'0');
          index++;
        }
        integerStack.push(count);
      } else if (value.charAt(index) == '[') {
        stringStack.push(res);
        res = "";
        index++;
      } else if (value.charAt(index) == ']') {
        int range = integerStack.pop();
        StringBuilder builder = new StringBuilder(stringStack.pop());
        for (int i = 0; i < range; i++) {
          builder.append(res);
        }
        res = builder.toString();
        index++;
      } else {
        res = res + value.charAt(index);
        index++;
      }
    }
    log.info("decoded string:{}",res);
  }
  public static void main(String args[]){
    new DecodeString().logic("3[a]2[bc]");
  }
}
