package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());

        if (first - second == 0 && third - first == 0 && second - third == 0) {
            System.out.println(first + " " + second + " " + third);
        }else if(first - third == 0 && third - first == 0){
            System.out.println(first + " " + third);
        }else if(second - first == 0 && second - first == 0){
            System.out.println(second + " " + first);
        }else if(second - third == 0 && third - second == 0){
            System.out.println(second + " " + third);
        }else if(third - first == 0 && first - third == 0){
            System.out.println(third + " " + first);
        }else if(third - second == 0 && second - third == 0){
            System.out.println(third + " " + second);
        }else if(first - second == 0 && first - third == 0){
            System.out.println(first + " " + second);
        }

    }
}