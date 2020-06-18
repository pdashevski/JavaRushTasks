package com.javarush.task.task14.task1419;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] ints = new int[2];
            int tempo = ints[2];
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object object[] = new String[10];
            object[1] = new Integer(10);
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte) ch);
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int ii = nNulArray.length;
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            ArrayList<String> strings = new ArrayList<>();
            strings.get(4);
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("DGds")));
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try {
            Integer integer = Integer.parseInt("dfds");
        }
        catch (Exception e){
            exceptions.add(e);
        }



        //напишите тут ваш код

    }
}
