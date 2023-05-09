package com.company.model.vehicles;

import com.company.model.details.Engine;
import com.company.model.professions.Driver;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Car {
    private String mark;
    private String carClass;
    private Integer weight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}
