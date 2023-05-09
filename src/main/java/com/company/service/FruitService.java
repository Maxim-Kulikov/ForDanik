package com.company.service;

import com.company.database.FruitsDB;
import com.company.model.fruit.Fruit;

import java.util.List;

public enum FruitService {
    INSTANCE;

    private final FruitsDB fruitsDB = FruitsDB.INSTANCE;

    public Double getTotalCost(){
        return countCost(fruitsDB.getApples()) +
                countCost(fruitsDB.getPears()) +
                countCost(fruitsDB.getPlums());
    }

    public Double getApplesCost(){
        return countCost(fruitsDB.getApples());
    }

    public Double getPlumsCost(){
        return countCost(fruitsDB.getPlums());
    }

    public Double getPearsCost(){
        return countCost(fruitsDB.getPears());
    }

    private Double countCost(List<Fruit> fruits){
        Double cost = 0.0;
        for(Fruit fruit: fruits){
            cost+=fruit.getCost();
        }
        return cost;
    }
}
