package com.javarush.task.task15.task1519;

import java.io.IOException;
import java.io.*;
/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Double dbl;
        boolean isDbl;
        while (!(s = reader.readLine()).equals("exit")){
            isDbl = false;
            try{
                if (s.contains(".")){
                    isDbl = true;
                }
                dbl = Double.parseDouble(s);
                if(dbl % 1 !=0|| isDbl){
                    print(Double.parseDouble(s));
                }else if (dbl <= 0 || dbl >= 128){
                    print(Integer.parseInt(s));
                }else if(dbl >0 && dbl <= 128){
                    print(Short.parseShort(s));
                }
            }catch(Exception e){
                print(s);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}