package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inStream = new FileInputStream(fileName);

        int fileData = 0;
        while (inStream.available() > 0){
            fileData = inStream.read();
            System.out.print((char) fileData);
        }



        reader.close();
        inStream.close();

    }
}