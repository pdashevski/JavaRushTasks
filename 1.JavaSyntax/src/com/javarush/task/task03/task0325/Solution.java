package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strDollars = reader.readLine();
        int intDollars = Integer.parseInt(strDollars);
        System.out.println("Я буду зарабатывать $" + intDollars + " в час");

    }
}
