package com.company.model.vehicles;

import com.company.model.details.Engine;
import com.company.model.professions.Driver;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class SportCar extends Car{
    private Integer maxSpeed;

    public SportCar(String mark, String carClass, Integer weight, Driver driver, Engine engine, Integer maxSpeed) {
        super(mark, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
