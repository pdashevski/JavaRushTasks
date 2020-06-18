package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());//a
        int b = Integer.parseInt(reader.readLine());//c
        int c = Integer.parseInt(reader.readLine());//b


        int max = 0;
        max = Math.max(a,(Math.max(b,c)));


        int min = 0;
        min = Math.min(a,(Math.min(b,c)));


        int maxMin = 0;
        maxMin = Math.max(a,(Math.min(b,c)));


        System.out.println(max + " " + maxMin + " " + min);
    }
}
