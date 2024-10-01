package org.example.Test_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 다형성
        // 상속 관계에 있을때, 조상 클래스의 타입으로 자손 클래스 객체 참조 가능
        Person p = new Student(); // 다형성
        Student st = new Student();
        Object obj = new Student();

        // 관점을 바꾼다고해도 실제 메모리에 생성된 인스턴스는 변함이 없다.
        // 관점만 바뀐것임.

        // 동적 바인딩
        // - 상속을 하면서, 자손 클래스에서 오버라이드 한 상황
        // - 타입과 상관없이 실제 객체가 가진 메섣 ㅡ호출됨
        // - 타입과 관계없이 실제 객체의 행위를 함.
        // - 타입만 가지고는 판단x



    }
}
