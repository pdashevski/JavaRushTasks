package com.javarush.task.task05.task0528;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
