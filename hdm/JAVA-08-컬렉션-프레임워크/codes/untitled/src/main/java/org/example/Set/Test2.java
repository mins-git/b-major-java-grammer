package org.example.Set;

import java.util.HashSet;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        // 왜 두사람?
        // set이 같다고 판단하는 기준: hashcode가 같으면서 equlas가 같아야함.
        set.add(new Person("luna", 3));
        set.add(new Person("luna", 3));

        System.out.println(set);
        // 사용자 정의 클래스를 사용하는 경우

    }
}
