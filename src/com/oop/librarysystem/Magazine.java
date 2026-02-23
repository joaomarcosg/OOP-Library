package com.oop.librarysystem;

public class Magazine implements Product{
    private String name;
    private String description;
    private double price;
    private Publisher publisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public boolean applyDiscount(double percent) {
        if (percent > 0.1) {
            return false;
        }
        double discount = getPrice() * percent;
        setPrice(getPrice() - discount);
        return true;
    }
}
