package com.company.database;

import com.company.model.student.Student;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum StudentsDB {
    INSTANCE;

    private final List<Student> students;

    StudentsDB() {
        students = new ArrayList<>();
        init();
    }

    public void save(Student student) {
        students.add(student);
    }

    private void init() {
        students.add(new Student("Ivan",
                "Ivanov",
                "121215",
                6.5));
        students.add(new Student("Maxim",
                "Maximov",
                "122578",
                9.1));
    }

}
