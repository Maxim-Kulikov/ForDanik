package com.company.model.fruit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Fruit {
    private Double weight;

    public void printManufacturerInfo(){
        System.out.println("Made in RB");
    }

    public abstract Double getCost();
}
