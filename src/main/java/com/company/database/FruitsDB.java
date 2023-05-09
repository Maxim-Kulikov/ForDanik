package com.company.database;

import com.company.model.fruit.Apple;
import com.company.model.fruit.Fruit;
import com.company.model.fruit.Pear;
import com.company.model.fruit.Plum;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum FruitsDB {
    INSTANCE;

    private final List<Fruit> pears;
    private final List<Fruit> apples;
    private final List<Fruit> plums;

    FruitsDB() {
        pears = new ArrayList<>();
        apples = new ArrayList<>();
        plums = new ArrayList<>();
        init();
    }

    private void init() {
        pears.add(new Pear(0.2, 6));
        pears.add(new Pear(0.35, 6));

        apples.add(new Apple(0.36, 3));
        apples.add(new Apple(0.27, 3));

        plums.add(new Plum(0.4, 7));
        plums.add(new Plum(0.22, 7));
    }
}
