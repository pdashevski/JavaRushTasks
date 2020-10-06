package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();

            try (FileReader fileReader = new FileReader(fileName1); FileWriter fileWriter = new FileWriter(fileName2)){
                ArrayList<Integer> list = new ArrayList<>();
                while (fileReader.ready()) {
                    int data = fileReader.read();
                    list.add(data);
                }
                for (int i = 1; i < list.size(); i+=2) {
                    fileWriter.write(list.get(i));
                    /*if ((list.get(i) % 2 == 0) *//*&& !((Character.isWhitespace(list.get(i))))*//*) {

                    }*/
                }
            }
        }


    }
}
