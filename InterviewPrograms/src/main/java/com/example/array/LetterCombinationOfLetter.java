package com.example.array;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class LetterCombinationOfLetter {
    List<String> stringList=new ArrayList<>();
    private void logic(String digits){
        String [] words = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder stringBuilder = new StringBuilder();
        dfs(0,digits,stringBuilder,words);
        stringList.forEach(data->System.out.print(data+" "));
    }

    private void dfs(int length,String digits,StringBuilder stringBuilder,String [] mappings){
        if (stringBuilder.length()==digits.length()){
            stringList.add(stringBuilder.toString());
            return;
        }
        char ch = digits.charAt(length);
        String word = mappings[ch-'0'];
        for (char c:word.toCharArray()){
            stringBuilder.append(c);
            dfs(length+1,digits,stringBuilder,mappings);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
    public static void main(String [] args){
        new LetterCombinationOfLetter().logic("345");
    }
}
