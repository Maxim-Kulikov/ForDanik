package com.company.model.student;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Student {
    private String firstName;
    private String lastname;
    private String group;
    private Double averageMark;

    public int getScholarship() {
        return averageMark >= 8 ? 100 : 80;
    }

}
