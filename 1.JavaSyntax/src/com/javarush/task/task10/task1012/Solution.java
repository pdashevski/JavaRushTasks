package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String str = "";
        for (int i = 0; i<list.size(); i++)
        {
            str += list.get(i);
        }
        char[] all = str.toCharArray();
        Arrays.sort(all);

        for (int i = 0; i < alphabet.size(); i++)
        {
            int count = 0;
            for (int j = 0; j < all.length; j++)
            {
                if (all[j] == alphabet.get(i))
                {
                    count++;
                }
            }
            System.out.println(alphabet.get(i).toString() + " " + count);
        }
    }
}
