package com.oop.librarysystem;

public class MiniBook extends Book {
    public MiniBook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percent) {
        return false;
    }
}
