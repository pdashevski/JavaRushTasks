package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            FileInputStream fis = new FileInputStream(consoleReader.readLine());
            byte[] buff = new byte[fis.available()];
            int count = fis.read(buff);
            if (count < 1000) {
                fis.close();
                consoleReader.close();
                throw new DownloadException();
            }

        }

    }

    public static class DownloadException extends Exception {

    }
}
