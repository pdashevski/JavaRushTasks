package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0 ; i <10; i++){
            list.add(reader.readLine());
        }
        String min = list.get(0);
        int minind = 0;
        int maxind = 0;
        for (int i = 0; i<10; i++){
            if  (list.get(i).length() < min.length()){
                min = list.get(i);
                minind = i;
            }
        }
        String max = list.get(0);
        for (int j = 0; j < 10; j++){
            if (list.get(j).length() > max.length())
            {
                max = list.get(j);
                maxind = j;
            }
        }
        if (minind > maxind){
            System.out.println(max);
        }
        else {
            System.out.println(min);
        }
    }
}
