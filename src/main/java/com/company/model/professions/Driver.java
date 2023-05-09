package com.company.model.professions;

import lombok.*;

@Setter
@Getter
@ToString
public class Driver extends Person {
    private Integer experience;

    public Driver(String fio, Integer age, Integer experience) {
        super(fio, age);
        this.experience = experience;
    }
}
