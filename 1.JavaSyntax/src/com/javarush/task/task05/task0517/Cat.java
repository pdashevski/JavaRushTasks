package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address = null;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 10;
        this.weight = 80;
        this.address = address;
        this.color = "Brown";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = address;
        this.color = "Red";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 111;
        this.address = address;
        this.color = "Yellow";
    }

    public Cat(int weight, String color){
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = 19;
    }

    public Cat(int weight, String color, String address){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 14;
    }


    public static void main(String[] args) {

    }
}
