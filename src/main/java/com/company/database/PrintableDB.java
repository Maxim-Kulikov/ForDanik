package com.company.database;

import com.company.model.printable.Book;
import com.company.model.printable.Magazine;
import com.company.model.printable.Printable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum PrintableDB {
    INSTANCE;

    private List<Printable> books;
    private List<Printable> magazines;

    PrintableDB() {
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        init();
    }

    private void init() {
        books.add(new Book("book1"));
        books.add(new Book("book2"));

        magazines.add(new Magazine("magazine1"));
        magazines.add(new Magazine("magazine2"));
    }
}
