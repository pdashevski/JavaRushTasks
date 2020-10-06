package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            try (FileReader fileReader = new FileReader(bufferedReader.readLine())) {
                char ch;
                int count = 0;
                StringBuilder myString = new StringBuilder();
                while (fileReader.ready()) {
                    ch = (char) fileReader.read();
                    myString = myString.append(ch);
                }
                String[] myString1 = myString.toString().split("\\s*(\\s|,|!|:|;|\\.)\\s*");

                for (String s: myString1) {
                    if (s.toLowerCase().equals("world")) {
                        count++;
                    }
                }
                System.out.println(count);

            }
        }
    }
}
