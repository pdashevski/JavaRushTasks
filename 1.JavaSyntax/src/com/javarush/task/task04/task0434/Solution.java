package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            int j=1;
            while (j<=10) {
                System.out.print(i*j + " ");
                if (j==10){
                    System.out.print("\n");
                }
                j++;
            }
            i++;
        }


    }
}
