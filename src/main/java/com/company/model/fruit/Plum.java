package com.company.model.fruit;

public class Plum extends Fruit {
    private Integer price;

    public Plum(Double weight, Integer price) {
        super(weight);
        this.price = price;
    }

    @Override
    public Double getCost() {
        return price*getWeight();
    }
}
