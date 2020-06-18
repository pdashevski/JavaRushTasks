package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args){
        try{
            divideByZero();
        }
        catch (ArithmeticException exception){
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            exception.printStackTrace();
        }
    }
    
    public static void divideByZero() {
        int a = 2;
        int c = a / 0;
        System.out.println(c);
    }
}
