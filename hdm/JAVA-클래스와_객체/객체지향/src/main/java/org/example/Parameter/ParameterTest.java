package org.example.Parameter;

import org.example.Person.Person;

public class ParameterTest {
    public static void main(String[] args) {
        Person p = new Person();

        p.study((short)10);
        p.study('A');
    }
}
