package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean is = true;
        while(is){
            int[] numbers = {Integer.parseInt(reader.readLine())};
            for(int i = 0; i != numbers.length; i++){
                sum += numbers[i];
                if(numbers[i] == -1){
                    System.out.println(sum);
                    is = false;
                    break;

                }
            }


        }

    }
}
