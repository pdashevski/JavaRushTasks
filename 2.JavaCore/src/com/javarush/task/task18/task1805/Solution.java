package com.javarush.task.task18.task1805;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        reader.close();

        TreeSet<Integer> set = new TreeSet<>();
        while (inputStream.available() > 0){
            int data = inputStream.read();
            set.add(data);
        }
        inputStream.close();


        for (Integer i: set) {
            System.out.print(i + " ");

        }

    }
}
