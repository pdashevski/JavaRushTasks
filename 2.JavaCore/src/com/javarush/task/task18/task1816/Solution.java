package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int i;
            int cout = 0;
            while ((i = fileInputStream.read()) != -1) {
                if (((char) i >= 'A' && (char) i <= 'Z') || ((char) i >= 'a' && (char) i <= 'z')){
                    cout++;
                }
            }
            System.out.println(cout);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
