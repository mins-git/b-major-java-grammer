package org.example.JVM.Static.Score;

public class ScoreTest {

    public static void main(String[] args) {

        // 생성자를 막아놓았기때문에 객체 생성 안됨.
        // 객체는 getinstance static 메서드로 가지고오기

        ScoreManager min1 = ScoreManager.getInstance();
        ScoreManager min2 = ScoreManager.getInstance();

        // 유일한 1개의 객체임을 보장할 수 잇음.
        System.out.println(min1 == min2); // true나옴.

    }
}
