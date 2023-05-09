package com.company.model.student;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
public class Magistracy extends Student {
    private String scienceWork;

    public Magistracy(String firstName, String lastname, String group, Double averageMark, String scienceWork) {
        super(firstName, lastname, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() >= 8.0 ? 200 : 180;
    }


}
