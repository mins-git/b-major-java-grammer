package org.example.TestSuper;


// extends 키워드를 명시하지 않으면 사실은 object 클래스를 상속하고 ㅣ있는것임.
public class Person extends Object {
    String name;
    int age;

    public Person(){
        // super()가 생략됨.
        // object 클래스의 생성자를 호출하고 있음.

    }; // 기본생성자 호출

    // 부모 클래스에서 매개 변수가 있는 생서자를 만들면
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("밥 먹음");
    }

}
