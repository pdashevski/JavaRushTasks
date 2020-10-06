package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            try (FileReader fileReader = new FileReader(bufferedReader.readLine());
                 FileWriter fileWriter = new FileWriter(bufferedReader.readLine())) {
                char ch;
                StringBuilder stringBuilder = new StringBuilder();
                while (fileReader.ready()) {
                    ch = (char) fileReader.read();
                    stringBuilder = stringBuilder.append(ch);
                }
            }

        }
    }
}
