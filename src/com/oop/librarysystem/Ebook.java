package com.oop.librarysystem;

public class Ebook extends Book{
    private String watermark;

    public Ebook(Author author) {
        super(author);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
