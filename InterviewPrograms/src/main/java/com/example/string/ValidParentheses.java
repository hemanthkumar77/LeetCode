package com.example.string;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Stack;

@Slf4j
public class ValidParentheses {
    private boolean logic(String pattern) {
        HashMap<Character,Character> hashMap = new HashMap<>();
        hashMap.put('}','{');
        hashMap.put(']','[');
        hashMap.put(')','(');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<pattern.length();i++){
            char value = pattern.charAt(i);
            if(hashMap.containsKey(value)){
                char trace = stack.pop();
                if(trace!=hashMap.get(value)){
                    return false;
                }
            }else{
                stack.push(value);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String []args){
        String pattern = "()[]{}";
        log.info("pattern is present:{}",new ValidParentheses().logic(pattern));
    }
}
