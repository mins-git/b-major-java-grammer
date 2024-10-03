package org.example.ExceptionTEST.test03;

import static org.example.ExceptionTEST.test03.ThrowsTest1.method2;

public class ThrowsTest2 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method02();
    }
    public static void method02(){
        int i = 1 / 0; // uncheckedexception 발생 가능.
    }

}
