package com.example.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonPrefix {
    private String logic(String[]data){
        String prefix = data[0];
        for(int i=1;i<data.length;i++){
            while (data[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String []args){
        String [] data= {"flower","flow","flight"};
       log.info("commonPrefix:{}",new CommonPrefix().logic(data));
    }
}
