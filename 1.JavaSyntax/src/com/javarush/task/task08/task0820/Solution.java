package com.javarush.task.task08.task0820;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result1 = new HashSet<Dog>();
        
        result1.add(new Dog());
        result1.add(new Dog());
        result1.add(new Dog());
        
        return result1;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> joining = new HashSet<>();
        Set<Object> pets = new HashSet<>();
        joining.addAll(cats);
        joining.addAll(dogs);
        pets.addAll(joining);
        return joining;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class Cat{
        
    }
    
    public static class Dog{
        
    }
}
