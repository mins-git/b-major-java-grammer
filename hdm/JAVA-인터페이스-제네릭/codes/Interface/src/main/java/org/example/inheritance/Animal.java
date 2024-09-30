package org.example.inheritance;

public class Animal implements AnimalBehavior {

    @Override
    public void speak(){

    }
    @Override
    public void eat() { //     // 클래스가 인터페이스를 구현하는 시점에 메서드 내용을 정의하면 되기에 상관 없다.
    } // 현재 Speakable, Eatable 둘다 eat() 이 있어도 상관 없음.

}
