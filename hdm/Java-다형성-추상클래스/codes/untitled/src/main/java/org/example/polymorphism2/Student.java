package org.example.polymorphism2;

public class Student extends Person {

    private String major;

    // 기본 생성자 추가
    public Student() {
        super("Unknown", 0); // 기본값 설정
        this.major = "Undeclared"; // 기본 전공 설정
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
}
