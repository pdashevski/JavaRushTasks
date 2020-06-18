package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String y = reader.readLine();
        int year = Integer.parseInt(y);


        if(year % 400 == 0){
            System.out.println("количество дней в году: 366");
        } else if(year % 400 != 0){
            year = year % 100;
            if(year != 0){
                year = year % 4;
                if(year == 0) {
                    System.out.println("количество дней в году: 366");
                } else System.out.println("количество дней в году: 365");
            } else System.out.println("количество дней в году: 365");
        }

    }
}