package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] nArr = new int[size];
        int arrMax = 0;
        if(size > 0){
            for(int i = 0; i < size; i++){
                nArr[i] = Integer.parseInt(reader.readLine());
            }
        }

        arrMax = nArr[0];
        for(int i = 0; i < size; i++){
            if(nArr[i] > arrMax){
                arrMax = nArr[i];
            }
        }
        System.out.println(arrMax);



        
        //int maximum = ;

        //напишите тут ваш код

        //System.out.println(maximum);
    }
}
