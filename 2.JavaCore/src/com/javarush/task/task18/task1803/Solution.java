package com.javarush.task.task18.task1803;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.Map;
import java.util.HashMap;
/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        Map<Integer, Integer> allAndCount = new HashMap<Integer, Integer>();
        FileInputStream fis = new FileInputStream(name);
        while (fis.available() > 0) {
            int bt = fis.read();
            if (allAndCount.containsKey(bt)) {
                int count = allAndCount.get(bt);
                allAndCount.put(bt, ++count);
            } else {
                allAndCount.put(bt, 0);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> bt: allAndCount.entrySet()) {
            if (bt.getValue() > max) {
                max = bt.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> bt: allAndCount.entrySet()){
            if (bt.getValue() == max){
                System.out.print(bt.getKey() + " ");
            }
        }

        fis.close();
    }
}