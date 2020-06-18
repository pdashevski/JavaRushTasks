package com.javarush.task.task08.task0817;

import java.util.*;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String > map = new HashMap<>();
        map.put("Дураков", "Иван");
        map.put("Попов", "Даниил");
        map.put("Евкакьев", "Леша");
        map.put("Ващин", "Иван");
        map.put("Алексеев", "Николай");
        map.put("Маресьев", "Иван");
        map.put("Ильин", "Николай");
        map.put("Лысеев", "Максим");
        map.put("Капков", "Николай");
        map.put("Хорев", "Василий");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> pair : map.entrySet()){
            if(Collections.frequency(map.values(), pair.getValue()) > 1){
                list.add(pair.getValue());
            }
        }

        for (String name : list) {
            removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

    }
}
