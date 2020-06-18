package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String number = bufferedReader.readLine();
        String year = bufferedReader.readLine();

        int number1 = Integer.parseInt(number);
        int year1 = Integer.parseInt(year);

        System.out.println(name + " получает " + number1 + " через " + year1 + " лет.");

    }
}
