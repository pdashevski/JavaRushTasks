package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();


        FileOutputStream fos = new FileOutputStream(fileName1);

        FileInputStream fis2 = new FileInputStream(fileName2);
        FileInputStream fis3 = new FileInputStream(fileName3);



        while (fis2.available() > 0) {

            fos.write(fis2.read());
        }



        while (fis3.available() > 0) {
            fos.write(fis3.read());
        }

        fos.close();
        fis2.close();
        fis3.close();
        reader.close();


    }
}
