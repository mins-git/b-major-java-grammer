package org.example.Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Set
        // 순서 x 중복 x
        // 구현체로 HashSet 사용
        // Java util

        Set<String> names = new HashSet<>();

        names.add("luna");
        names.add("mz");
        names.add("kiki");
        names.add("kook");

        System.out.println(names);
//        System.out.println("luna".hashCode());



    }
}
