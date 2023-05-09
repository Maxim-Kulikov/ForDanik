package com.company.service;

import com.company.database.PrintableDB;
import com.company.model.printable.Printable;

import java.util.ArrayList;
import java.util.List;

public enum PrintableService {
    INSTANCE;

    private final PrintableDB printableDB = PrintableDB.INSTANCE;

    public List<Printable> getPrintableList(){
        List<Printable> list = new ArrayList<>(printableDB.getBooks());
        list.addAll(printableDB.getMagazines());
        return list;
    }
}
