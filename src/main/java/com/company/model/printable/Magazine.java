package com.company.model.printable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Magazine implements Printable{
    private String name;

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
