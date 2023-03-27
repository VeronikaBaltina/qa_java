package com.example;

import java.util.List;
// класс кошачьих наследник класса Животное реализует интерфейс класса Хищник
public class Feline extends Animal implements Predator {
// ест мясо исключение Хищник
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
    //семейство кошачьих
    @Override
    public String getFamily() {
        return "Кошачьи";
    }
    // заводят котят сколько раз
    public int getKittens() {
        return getKittens(1);
    }
    // сколько всего котят
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
