package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        sort(arr);

        minimum = arr[0];
        maximum = arr[19];

        System.out.print(maximum + " " + minimum);
    }

    public static void sort(int[] arr){
        Arrays.sort(arr);
    }
}
