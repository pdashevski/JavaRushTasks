package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int countWhiteSpace = 0;
        int countSymb = 0;
        try (FileReader fr = new FileReader(args[0])) {
            while (fr.ready()) {
                int readedChar = fr.read();
                countSymb++;
                if (readedChar == (int) ' ') {
                    countWhiteSpace++;
                }
            }
        }



        if (countSymb != 0) {
            double value = (double) countWhiteSpace / countSymb * 100;
            System.out.printf("%.2f", value);
        }

    }
}
