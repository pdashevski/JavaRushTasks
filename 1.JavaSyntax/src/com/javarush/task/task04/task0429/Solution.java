package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countMinus = 0;
        int countPlus = 0;
        int[] arr = {a,b,c};
        for(int i = 0; i < 3; i++){
            if(arr[i] < 0 && arr[i] != 0){
                countMinus++;
            }else if (arr[i] > 0 && arr[i] != 0){
                countPlus++;
            }
        }
        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);

    }
}
