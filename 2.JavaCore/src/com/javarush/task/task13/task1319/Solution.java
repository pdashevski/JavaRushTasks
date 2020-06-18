package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            String lines;

            while(!(lines= reader.readLine()).equals("exit")){
                writer.write(lines + "\n");
            }
            writer.write("exit" + "\n");

            writer.close();
            fileWriter.close();
            reader.close();



        }
        catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
