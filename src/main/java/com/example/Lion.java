package com.example;

import java.util.List;
//Lion класс лев?
public class Lion {
    private Feline feline;
    // имеет гриву
    boolean hasMane;
    // если пол самец то грива есть иначе гривы нет

    public Lion(Feline feline) {
        this.feline = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    // класс кошачий

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
