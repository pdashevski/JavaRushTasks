package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] string = new String[10];
        int[] digit = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < string.length; i++){
            string[i] = reader.readLine();
        }
        for(int i = 0; i < digit.length; i++){
            digit[i] = string[i].length();
            System.out.println(digit[i]);
        }
    }
}
