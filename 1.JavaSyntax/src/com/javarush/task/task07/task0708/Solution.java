package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        int max = strings.get(0).length();
        String s = "";
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).length() > max){
                max = strings.get(i).length();
                s = strings.get(i);
            }
        }
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).length() == max){
                s = strings.get(i);
                System.out.println(s);
            }
        }
    }
}
