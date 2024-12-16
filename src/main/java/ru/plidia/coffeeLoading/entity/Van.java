package ru.plidia.coffeeLoading.entity;

import java.util.ArrayList;
import java.util.List;

public class Van {
    private int maxWeight;
    private int maxCost;
    private List<Coffee> coffeeList;
    private int currentWeight;
    private int currentCost;

    public Van() {
    }

    public Van(int maxWeight, int maxCost) {
        this.maxWeight = maxWeight;
        this.maxCost = maxCost;
        coffeeList = new ArrayList<>();
        currentCost = 0;
        currentWeight = 0;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(int maxCost) {
        this.maxCost = maxCost;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(int currentCost) {
        this.currentCost = currentCost;
    }

    public void loadingVan(Coffee coffee) {
        coffeeList.add(coffee);
        currentWeight += coffee.getWeight();
        currentCost += coffee.getCost();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("В фургон общей вместимостью - ").append(maxWeight)
                .append(" кг, будет загружен товар на общую сумму не более - ").append(maxCost)
                .append(" рублей: ").append("\n").append(coffeeList).toString();
    }
}
