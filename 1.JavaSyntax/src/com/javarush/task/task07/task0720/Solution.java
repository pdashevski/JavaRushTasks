package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            list.add(reader.readLine());
        }

        int count = 0;
        for(int i = 0; i < m; i++){
            while (count < m){
                list.add(list.get(i));
                list.remove(list.get(i));
                count++;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }

    }
}