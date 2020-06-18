package com.javarush.task.task14.task1408;


public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
            return 5;
    }
    
    public String getDescription(){
        return super.getDescription() + " Моя страна - Ukraine. Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    
    /*<getDescription() родительского класса> + < Моя страна
    - Sssss. Я несу N яиц в месяц.> где Sssss - название страны,
    а N - количество яиц в месяц.*/
        
}