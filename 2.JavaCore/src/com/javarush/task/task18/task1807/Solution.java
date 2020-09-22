package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        //String name = "c:/data.txt";
        FileInputStream inputStream = new FileInputStream(name);
        int count = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 44) {
                count++;
            }
        }

        System.out.println(count);
        inputStream.close();

    }
}
