package org.example.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog("메리", 4);
        System.out.println(d.name);
        System.out.println(d.age);

        Dog d2 = new Dog(); // 컴파일러가 기본 생성자를 안 만들어줘서 그럼.

        d2.eat().drink(); // 메서드 체이닝
    }

}
