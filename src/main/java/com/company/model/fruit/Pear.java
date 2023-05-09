package com.company.model.fruit;

public class Pear extends Fruit{
    private Integer price;

    public Pear(Double weight, Integer price) {
        super(weight);
        this.price = price;
    }

    @Override
    public Double getCost() {
        return price*getWeight();
    }
}
