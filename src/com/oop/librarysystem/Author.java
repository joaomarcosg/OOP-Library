package com.oop.librarysystem;

public class Author {
    String name;
    String email;
    String cpf;

    void ShowDetails() {
        System.out.println("Showing author details");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
