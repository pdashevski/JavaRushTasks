package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            String s;
            while((s = br.readLine()) != null) {
                lines.add(s);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Проверьте путь к файлу!" + e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        for(int i = 0; i < lines.size(); i++){
            System.out.println(lines.get(i));
        }
    }
}
