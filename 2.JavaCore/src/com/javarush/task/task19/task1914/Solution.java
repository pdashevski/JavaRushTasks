package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String s = outputStream.toString();
        //Возвращаем все как было
        System.setOut(consoleStream);
        StringBuilder stringBuilder = new StringBuilder(s);

        if (stringBuilder.toString().matches("(\\d+) ([+*\\-]) (\\d+) = (\\r\\n|\\r|\\n)")) { // \r - Mac, \n - Unix, \r\n - Windows and DOS
            String[] arr = stringBuilder.toString().split(" ");
            BigInteger sum = BigInteger.valueOf(0);
            BigInteger numOne = BigInteger.valueOf(Long.parseLong(arr[0]));
            BigInteger numTwo = BigInteger.valueOf(Long.parseLong(arr[2]));

            if (arr[1].equals("+")) {
                sum = numOne.add(numTwo);
            } else if (arr[1].equals("-")) {
                sum = numOne.subtract(numTwo);
            } else if (arr[1].equals("*")) {
                sum = numOne.multiply(numTwo);
            }
            System.out.println(String.format("%s %s %s = %d", arr[0], arr[1], arr[2], sum));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

