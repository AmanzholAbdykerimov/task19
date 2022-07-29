package com.company;

public class Human {
    String name;
    int age;
    String roleOfFmily;

    @Override
    public String toString() {
        return name+" "+age+" "+roleOfFmily;
    }

    public Human(String name, int age, String roleOfFmily) {
        this.name = name;
        this.age = age;
        this.roleOfFmily = roleOfFmily;
    }
}
