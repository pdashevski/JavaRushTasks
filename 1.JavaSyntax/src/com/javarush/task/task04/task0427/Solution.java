package com.javarush.task.task04.task0427;

/*
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String l = reader.readLine();
        int v = Integer.parseInt(l);
        int a = l.length();

        int b = 1;
        int c = 2;
        int d = 3;

        boolean m = (v%2==0);
        boolean n = (v%0.5==0);
        boolean x = (v>=1);


        if (a==b && m && x)
            System.out.println("четное однозначное число");
        else
        if ( a==b && n && x)
            System.out.println("нечетное однозначное число");
        else
        if ( a==b && n && x)
            System.out.println("нечетное однозначное число");
        else
        if (a==c && m&& x)
            System.out.println("четное двузначное число");
        else
        if (a==c && n&& x)
            System.out.println("нечетное двузначное число");
        else
        if (a==d && m&& x)
            System.out.println("четное трехзначное число");
        else
        if (a==d && n&& x)
            System.out.println("нечетное трехзначное число");
    }
}
