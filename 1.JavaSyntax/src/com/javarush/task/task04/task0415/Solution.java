package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);

        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);

        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Треугольник существует.");
        } else if (a + b <= c && b + c <= a && a + c <= b) {
            System.out.println("Треугольник не существует.");

        } else System.out.println("Треугольник не существует.");

    }



}