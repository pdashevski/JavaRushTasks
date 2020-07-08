package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);


        int min = inputStream.read();
        int oneByte;
        while (inputStream.available() > 0){
            oneByte = inputStream.read();
            if (oneByte < min){
                min = oneByte;
            }

        }
        inputStream.close();
        reader.close();

        System.out.println(min);
    }
}
