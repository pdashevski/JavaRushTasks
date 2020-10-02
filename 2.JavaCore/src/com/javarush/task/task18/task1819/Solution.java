package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream bt = new ByteArrayOutputStream();

        try (FileInputStream fis1 = new FileInputStream(fileName1); FileInputStream fis2 = new FileInputStream(fileName2)) {
            while (fis2.available() > 0) {
                bt.write(fis2.read());
            }

            while (fis1.available() > 0) {
                bt.write(fis1.read());
            }
        }
        try (FileOutputStream fos = new FileOutputStream(fileName1)) {
            bt.writeTo(fos);
        }
    }
}
