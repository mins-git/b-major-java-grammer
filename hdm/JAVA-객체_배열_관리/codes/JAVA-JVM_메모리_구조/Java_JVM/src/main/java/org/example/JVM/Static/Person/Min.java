package org.example.JVM.Static.Person;

public class Min extends Person {
    String name;
    int age;
    private String name1;
    private int age1;
    private boolean hungry;
    // 객체 지향 방식(캡슐화) 를 설계하면 기본적으로 private 설정.(보안)

    // 변수에 접근하는 통로는 메서드를 통해 만들고 메서드는 public으로 열어놓음

    // 접근자 getter: 현재 객체의 멤버 변수 값을 반환해주는 함수임.
    public int getAge() {
        return age;
    }
    // 설정자 setter: 현재 객체의 멤버 변수의 값을 변경 <= 새로운 값은 매개변수로 받음.
    public void setAge(int age){
        // 검사 로직과 같은것을 추가 가능.
        if(age < 0){
            System.out.println("나이가 음수 될 수 없다.");
            return; // 호출한곳으로 반환
        }
        this.age = age;
    }

}
