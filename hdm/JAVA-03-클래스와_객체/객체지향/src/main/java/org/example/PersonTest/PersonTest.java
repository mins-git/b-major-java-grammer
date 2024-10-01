package org.example.PersonTest;
import org.example.Person.Person;

public class PersonTest {

    public static void main(String[] args) {

        Person yang = new Person();
        yang.name = "Yang";
        yang.age = 45;
        yang.hobby = "YouTube";

        Person hong = new Person();
        hong.name = "Hong";
        hong.age = 25;
        hong.hobby = "Golf";

        // 매개변수 넣는 연습.
        info(yang.name, yang.age, yang.hobby);
        // 이런 함수의 문제점은?
        // Person과 밀접하게 관련된 로직임. 객체지향적이지 않음.


    }

    public static void info(String name, int age, String hobby){
        System.out.println( "이름은" + name + "이고, 나이는" + age +"세입니다." );

    }
}
