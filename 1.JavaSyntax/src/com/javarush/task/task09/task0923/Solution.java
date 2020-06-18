package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] vowels1 = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'}; //soglas
    public static char[] vowels2 = new char[]{'.'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] str1 = str.toCharArray();

        ArrayList<Character> charVowels = new ArrayList<>();
        ArrayList<Character> charVowels1 = new ArrayList<>();

        for(int i = 0; i < str1.length; i++){
            if(isVowel(str1[i]) == true){
                charVowels.add(str1[i]);
            }
            if(isVowel1(str1[i]) == true){
                charVowels1.add(str1[i]);
            }
            if(isVowel2(str1[i]) == true){
                charVowels1.add(str1[i]);
            }
        }

        for(int i = 0; i < charVowels.size(); i++){
            System.out.print(charVowels.get(i) + " ");
        }

        System.out.println("");

        for(int i = 0; i < charVowels1.size(); i++){
            System.out.print(charVowels1.get(i) + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel1(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels1) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel2(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels2) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}