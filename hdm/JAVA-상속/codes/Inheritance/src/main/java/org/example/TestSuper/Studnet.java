package org.example.TestSuper;

public class Studnet extends Person {

    // student는 아무생성자도 없음 : 컴파일러가 기본생성자 Student(){}를 만들어줌
    // > 생성자는 내부에 기본적으로 super();가 생략되어 있음.
    // > 기본적으로 부모클래스의 기본생성자를 호출한다는 뜻!

    // 빈 공간에서 ctrl + spacebar
//    public Studnet() {
//        super(); // 생성자 내부에는 기본적으로 super();가 생략됨.
//        > person에 생성자 생성해줘서 super 자동 생성해줌
        // 프로그래머가 명시적으로 super()을 호출하지 않아도
        // 기본적으로 super 호출해줌.
        // 그러면 호출하면 어떻게 되는데?
        // -> super()을 넣어주지 않음.
//    }



    String name;
    int age;
    String major;

    void eat() {
        System.out.println("학생 밥 먹음");
    }

    void study() {
        System.out.println("공부중");
    }

}
