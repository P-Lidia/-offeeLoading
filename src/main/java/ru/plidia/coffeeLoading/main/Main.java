package ru.plidia.coffeeLoading.main;

import ru.plidia.coffeeLoading.entity.Coffee;
import ru.plidia.coffeeLoading.entity.Van;
import ru.plidia.coffeeLoading.util.LoadingCoffee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coffee> coffee = new ArrayList<>();
        coffee.add(new Coffee("Кофе растворимый в банках", 264000, 220));
        coffee.add(new Coffee("Кофе растворимый в пакетах", 230000, 200));
        coffee.add(new Coffee("Арабика молотый", 320000, 160));
        coffee.add(new Coffee("Робуста молотый", 290000, 190));
        coffee.add(new Coffee("Арабика зерна светлой обжарки", 239000, 145));
        coffee.add(new Coffee("Арабика зерна средней обжарки", 232000, 139));
        coffee.add(new Coffee("Арабика зерна темной обжарки", 241000, 151));
        coffee.add(new Coffee("Робуста зерна светлой обжарки", 159000, 149));
        coffee.add(new Coffee("Робуста зерна средней обжарки", 147000, 137));
        coffee.add(new Coffee("Робуста зерна темной обжарки", 142000, 132));
        Van van = new Van(2000, 2000000);
        LoadingCoffee loading = new LoadingCoffee();
        System.out.println(loading.loadingCoffee(van, coffee));
    }
}