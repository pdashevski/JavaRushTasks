package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            list.add(0,reader.readLine());
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
