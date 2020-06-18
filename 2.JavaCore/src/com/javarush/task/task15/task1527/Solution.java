package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
            reader.close();
        }
        catch (IOException e){

        }
        System.out.println(s);

        String[] parameters = s.split("\\?");

        for(String aa: parameters){
            System.out.println(aa);
        }



        parameters.to.split("=");

        params2.toString();

        for(String bb: params2){
            System.out.println(bb);
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
