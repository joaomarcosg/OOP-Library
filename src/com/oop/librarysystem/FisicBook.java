package com.oop.librarysystem;

public class FisicBook extends Book {
    public FisicBook(Author author) {
        super(author);
    }

    public double getPrintingFee() {
        return this.getPrice() * 0.05;
    }

    public boolean applyDiscount(double percent) {
        if (percent > 0.3) {
            return false;
        }
        double discount = getPrice() * percent;
        setPrice(getPrice() - discount);
        return true;
    }
}
