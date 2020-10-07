package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = consoleReader.readLine();
            fileName2 = consoleReader.readLine();
        }

        char ch;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader(fileName1))) {
            while (bf.ready()) {
                ch = (char) bf.read();
                stringBuilder = stringBuilder.append(ch);
            }
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName2))) {
            String s = stringBuilder.toString();
            br.write(s.replaceAll("\\p{Punct}", ""));

        }
    }
}
