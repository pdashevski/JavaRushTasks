package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int countE = 0;
        char[] sC = s.toCharArray();
        for(int i = 0; i < sC.length; i++){
            int n = Integer.parseInt(sC[i]);
            if(n % 2 == 0){
                countE++;
                System.out.println(countE);
            }
        }


    }
}
