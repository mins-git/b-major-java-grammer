package org.example.Person;

import org.example.Parameter.Parameter;

public class Person extends Parameter {
    public String name ;
    public int age ;
    public String hobby ;


    // 관련된 데이터와 로직을 하나로 묶어준다.
    // 멤버 메서드
    // 멤버 변수는 객체(인스턴스) 자신이 가지고 있기때문에 굳이 매개변수로 넣지 않아도 접근 가능.
    // static : 클래스 (설계도)
    //
    public void info(String name, int age, String hobby){
        System.out.println( "이름은" + name + "이고, 나이는" + age +"세입니다." );
    }

}
