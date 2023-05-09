package com.company.database;

import com.company.model.student.Magistracy;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum MagistracyDB {
    INSTANCE;

    private final List<Magistracy> magistracies;

    MagistracyDB() {
        magistracies = new ArrayList<>();
        init();
    }

    public void save(Magistracy magistracy) {
        magistracies.add(magistracy);
    }

    private void init() {
        magistracies.add(new Magistracy("Danik",
                "Goncharov",
                "111111",
                9.0,
                "some work"));
        magistracies.add(new Magistracy("Vova",
                "Zalesskiy",
                "111112",
                7.5,
                "some work 2"));
    }
}
