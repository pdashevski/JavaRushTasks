package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        StringBuilder str = new StringBuilder();
        char ch;

        try (BufferedReader bf = new BufferedReader(new FileReader(fileName1))) {
            while (bf.ready()) {
                ch = (char) bf.read();
                str = str.append(ch);
            }
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName2))) {
            String s = str.toString();
            br.write(s.replace('.', '!'));

        }
    }
}
