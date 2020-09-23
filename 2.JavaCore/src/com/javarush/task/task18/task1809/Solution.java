package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(name1);
            FileOutputStream fileOutputStream = new FileOutputStream(name2);

            byte[] buffer = new byte[fileInputStream.available()];
            byte[] buffer1 = new byte[buffer.length];

            while (fileInputStream.available() > 0) {
                int count = fileInputStream.read(buffer);

                for(int i = buffer1.length - 1; i >= 0; i--) {
                    fileOutputStream.write(buffer[i]);
                }


            }

            reader.close();
            fileInputStream.close();
            fileOutputStream.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }




    }
}
