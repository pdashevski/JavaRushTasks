package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "5";

        Protoss prot1 = new Protoss();
        prot1.name = "1";
        Protoss prot2 = new Protoss();
        prot2.name = "2";
        Protoss prot3 = new Protoss();
        prot3.name = "3";

        Terran ter1 = new Terran();
        ter1.name = "1";
        Terran ter2 = new Terran();
        ter2.name = "2";
        Terran ter3 = new Terran();
        ter3.name = "3";
        Terran ter4 = new Terran();
        ter4.name = zerg4.name;
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
