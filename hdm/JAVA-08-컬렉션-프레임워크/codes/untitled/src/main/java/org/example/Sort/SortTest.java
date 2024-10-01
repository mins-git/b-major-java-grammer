package org.example.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {

        // 순서가 있는 자료구조 List

        List<Person> Person = new ArrayList<>();

        Person.add(new Person("mini", 3));
        Person.add(new Person("23", 5));
        Person.add(new Person("kogi", 6));

        //        Person.add("mimi");
//        Person.add("nana");

        System.out.println(Person);

        // 증렬
        // collections 유틸리티 클래스의 sort()메서드 사용

        Collections.sort(Person); // 알파벳 순서대로 오름차순 정렬
        // 사용자 정의 클래스를 사용한 리스트는 정렬할 수 없음.
        // 비교 기준이 없으므로 사용자 정의 클래스에 비교 기준을 만들어주면됨.

        System.out.println(Person);

    }
}
