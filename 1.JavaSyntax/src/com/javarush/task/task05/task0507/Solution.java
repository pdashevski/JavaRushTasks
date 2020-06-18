package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

/*public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double sum = 0;
        String s;
        while(true){
            s = reader.readLine();
            count++;
            if(s.equals("-1")){
                count--;
                break;
            }
            sum += Integer.parseInt(s);
        }
        System.out.println(sum/count);
    }
}*/

public class Solution{
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++){
            Solution solution = new Solution();
            solution = null;
        }
    }

    private String name;

    public Solution(String name){
        this.name = name;
    }

    public Solution(){

    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Объект солу уничтожен!");
    }

}

