package org.example.Parameter;

public class Parameter {

    String name;
    int age;
    String hobby;

//            void info() {
//                System.out.println( "이름은" + name + "이고, 나이는" + age +"세입니다." );
//            }
//}

    public void study(int time) {
        // int time = (호출할 떠ㅐ 넘겨준 값)
        System.out.println(time + "시간 동안 공부합니다.");
    }

    // 메서드 오버로딩?
    // 이름이 같으면서 매개변수가 다른 메서드를 정의 할 수 있음./
    public void study(long time){
        System.out.println("매서드 오버로딩 완료" + time);
    }

    public void study(double time){
        System.out.println("매서드 오버로딩 완료" + time);
    }
    // 순서가 다른것: 오버로딩 가능
    public void study(String subject, int time){
        System.out.println("오버로딩");
    }
    public void study(int time, String subject){
        System.out.println("오버로딩");
    }
    // 변수이름만 다른것: 안됨.
    // 빨간줄 뜨면 안됨.

}

