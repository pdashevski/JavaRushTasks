package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));



        StringBuilder stringBuilder = new StringBuilder();

        while (fileReader.ready()){
            stringBuilder.append((char) fileReader.read());
        }
        fileReader.close();
        String s = stringBuilder.toString();
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            fileWriter.write(matcher.group()+ " ");
        }

        fileWriter.close();
    }
}
