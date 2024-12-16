package ru.plidia.coffeeLoading.util;

import ru.plidia.coffeeLoading.entity.Coffee;
import ru.plidia.coffeeLoading.entity.Van;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LoadingCoffee {
    public String loadingCoffee(Van van, List<Coffee> coffee) {
        Map<Integer, Coffee> priceToWeightRatio = new TreeMap(Collections.reverseOrder());
        for (Coffee coffeeList : coffee) {
            priceToWeightRatio.put(coffeeList.getCost() / coffeeList.getWeight(), coffeeList);
        }
        for (Map.Entry<Integer, Coffee> entry : priceToWeightRatio.entrySet()) {
            if (van.getMaxWeight() > van.getCurrentWeight() + entry.getValue().getWeight()
                    && van.getMaxCost() > van.getCurrentCost() + entry.getValue().getCost()) {
                van.loadingVan(entry.getValue());
            }
        }
        StringBuilder sb = new StringBuilder();
        return sb.append(van).append("\n")
                .append("Общий вес кофе составляет - ").append(van.getCurrentWeight())
                .append(" кг, общая стоимость кофе - ").append(van.getCurrentCost())
                .append(" рублей.").toString();
    }
}

