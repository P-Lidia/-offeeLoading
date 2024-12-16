package ru.plidia.coffeeLoading.entity;

public class Coffee {
    private String typeCoffee;
    private int cost;
    private int weight;

    public Coffee() {
    }

    public Coffee(String typeCoffee, int cost, int weight) {
        this.typeCoffee = typeCoffee;
        this.cost = cost;
        this.weight = weight;
    }

    public void setTypeCoffee(String typeCoffee) {
        this.typeCoffee = typeCoffee;
    }

    public String getTypeCoffee() {
        return typeCoffee;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("\n").append(typeCoffee).append(", стоимость ").append(cost)
                .append(", вес ").append(weight).toString();
    }
}
