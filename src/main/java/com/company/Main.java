package com.company;

import com.company.database.MagistracyDB;
import com.company.database.StudentsDB;
import com.company.model.printable.Book;
import com.company.model.printable.Magazine;
import com.company.model.student.Student;
import com.company.service.FruitService;
import com.company.service.PrintableService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("-----------------------------------------------------------------------------------------");
        StudentsDB.INSTANCE.getStudents()
                .forEach(student -> System.out.println(student.getFirstName() + ": " + student.getScholarship()));
        MagistracyDB.INSTANCE.getMagistracies()
                .forEach(magistracy -> System.out.println(magistracy.getFirstName() + ": " + magistracy.getScholarship()));
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void task3() {
        FruitService fruitService = FruitService.INSTANCE;
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Общая стоимость фруктов: " + fruitService.getTotalCost());
        System.out.println("Общая стоимость яблок: " + fruitService.getApplesCost());
        System.out.println("Общая стоимость груш: " + fruitService.getPearsCost());
        System.out.println("Общая стоимость слив: " + fruitService.getPlumsCost());
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void task4(){
        PrintableService printableService = PrintableService.INSTANCE;
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Журналы:");
        printableService.getPrintableList().stream()
                        .filter(x -> x instanceof Magazine)
                        .forEach(System.out::println);
        System.out.println("Книги");
        printableService.getPrintableList().stream()
                .filter(x -> x instanceof Book)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------------------------");
    }

}