package com.oop.librarysystem;

public class Ebook extends Book{
    private String watermark;

    public Ebook(Author author) {
        super(author);
    }

    @Override
    public boolean applyDiscount(double percent) {
        if (percent > 0.15) {
            return false;
        }
        double discount = getPrice() * percent;
        setPrice(getPrice() - discount);
        return true;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
