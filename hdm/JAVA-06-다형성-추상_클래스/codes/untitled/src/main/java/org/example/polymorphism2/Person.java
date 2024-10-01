package org.example.polymorphism2;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study(){
        System.out.println("공부중");
    }
}
