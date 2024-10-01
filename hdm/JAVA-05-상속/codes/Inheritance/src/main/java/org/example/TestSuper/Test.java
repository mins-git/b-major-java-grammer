package org.example.TestSuper;

public class Test {
    public static void main(String[] args) {
        // 설계도에 생성자를 하나라도 프로그래머 정의하면
        // 컴파일러가 자동으로 기본생상자를 만들어주지 않음.

        Person p = new Person();

        Studnet st = new Studnet();

        st.eat(); // student에서 오버라이딩 되어서 학생 밥먹음 나옴.

    }
}
