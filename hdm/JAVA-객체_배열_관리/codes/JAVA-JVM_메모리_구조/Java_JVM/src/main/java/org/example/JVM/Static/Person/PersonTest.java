package org.example.JVM.Static.Person;

public class PersonTest {
    public static void main(String[] args) {
        // pCount는 스태틱 변수이기에 클래스 이름으로 바로 접근 가능함.
        System.out.println(Person.pCount);

        Person p = new Person();
        p.pCount = 200;
        System.out.println(p.pCount); // 인스턴스를 통해서도 접근 가능하지만 클래스 이름으로 접근하는것을 권장함.
        System.out.println();

    }
}
