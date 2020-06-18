package com.javarush.task.task13.task1325;

import java.awt.*;

/* 
Компиляция программы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public class Animal {
        Color getColor(){

            return Color.getColor("orange");
        }
    }

    public static class Fox extends Animal {
        public String getName() {
            return "Fox";
        }

        public Color getColor(){
            return this;
        }
    }

    public static class BigFox extends Fox {


    }

}
