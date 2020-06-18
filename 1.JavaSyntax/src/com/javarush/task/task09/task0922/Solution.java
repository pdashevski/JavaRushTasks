package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        SimpleDateFormat oldDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newDate = new SimpleDateFormat("MMM dd',' yyyy",Locale.ENGLISH);
        try{
            Date date = oldDate.parse(s);
            System.out.println(newDate.format(date).toUpperCase());
        }
        catch (ParseException e){

        }


    }


}
