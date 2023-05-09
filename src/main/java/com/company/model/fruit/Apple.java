package com.company.model.fruit;

public class Apple extends Fruit{
    private Integer price;

    public Apple(Double weight, Integer price) {
        super(weight);
        this.price = price;
    }

    @Override
    public Double getCost() {
        return price*getWeight();
    }
}
