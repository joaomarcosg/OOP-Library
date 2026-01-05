package com.oop.librarysystem;

public class Book {
    private String name;
    private String description;
    private double price;
    private String isbn;
    private Author author;

    public Book(Author author) {
        this.author = author;
        this.isbn = "000-00-00000-00-0";
    }

    void ShowDetails() {
        System.out.println("Showing book details");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
        if (this.ThereIsAnAuthor()) {
            author.ShowDetails();
        }
        System.out.println("------");
    }

    public boolean ApplyDiscount(double percent) {
        if (percent > 0.3) {
            return false;
        }
        this.price -= this.price * percent;
        return true;
    }

    void AddPrice(double price) {
        this.price = price;
    }

    double ReturnPrice() {
        return this.price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    boolean ThereIsAnAuthor() {
        return this.author != null;
    }
}
