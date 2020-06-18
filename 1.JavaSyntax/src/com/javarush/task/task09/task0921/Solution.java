package com.javarush.task.task09.task0921;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


            try
            {
                while (true){
                    int a = Integer.parseInt(bufferedReader.readLine());
                    arrayList.add(a);
                }

            }
            catch ( NumberFormatException | IOException e)
            {

                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i));
                }

            }

    }
}
