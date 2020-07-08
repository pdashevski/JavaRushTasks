package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        long maxData = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if(data > maxData) {
                maxData = data;
            }
        }
        inputStream.close();
        reader.close();

        System.out.println(maxData);
    }
}
