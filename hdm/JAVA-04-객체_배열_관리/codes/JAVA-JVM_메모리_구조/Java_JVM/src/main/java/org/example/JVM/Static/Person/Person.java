package org.example.JVM.Static.Person;

public class Person {

    // 전체 위치에서 불러올 수 있음.
    public String mimi;


    // ststic 변수
    // 클래스 설계또에 이미 들어있는 변수임.
    // 인스턴스 생성과 무관함. 이전에 이미 있음. 설계도가 메서드에  로딩되는 시점에 생김.
    // 클래스 이름으로 바로 적근 가능함.
    static int pCount = 100;

    // 아래는 실제 인스턴스가 생성 될 때, 힙 영역에 생김.
    // 객체 생성 후 해당 객체의 이름으로만 접근 가능해짐.
    // this: 각자의 인스턴스가 자기 자신을 가리키는 참조임.
    String name;
    int age;
    String hobby;

    //main은 static 메서드임(설계도)
    public static void main(String[] args) {
        // static은 non static 접근 불가함.
        //name = "Kim";
    }

    // non static
    public void info(){
        pCount = 300; // non static에서는 static 접근이 가능하다.
    }

    // 결국 static은 non stitic으로 접근 불가하나, nonstatic은 static접근 가능.
}
