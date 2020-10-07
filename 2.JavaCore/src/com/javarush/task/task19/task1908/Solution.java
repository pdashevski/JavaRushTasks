package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFile, outputFile;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFile = reader.readLine();
            outputFile = reader.readLine();
        }

        StringBuilder str = new StringBuilder();
        char ch;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            while(br.ready())
            {
                ch = (char) br.read();
                str = str.append(ch);
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(String.valueOf(str.toString().split("\\b\\d+\\b")));
        }
    }








                /*while (fileReader.ready()) {
                    bf.write(fileReader.read());
                }
                "(([A-Za-zА-Яа-я]+([\\d]*)).+?)|((([\\d]*[A-Za-zА-Яа-я]+)).+?)",""*/




}

