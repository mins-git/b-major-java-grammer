package org.example.test_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 인터페이스 다형성
        // 인터페이스: 타입으로도 사용 가능
        // 해당 인터페이스를 구현한 클래스로 만든 객체를 해당 인터페이스로 참조 가능
        // 실체 객체 행위가 일어나게됨.
        // 해당 인터페이스에 정의되어 있는 내용만 보임

        AlarmSound galaxyPhone = new GalaxyPhone();
        AlarmSound iphone = new IPhone();

        galaxyPhone.playAlarm();
        iphone.playAlarm();

        AlarmSound[] phones = {new GalaxyPhone(), new IPhone()};
        for (AlarmSound phone:phones){
            phone.playAlarm();
        }


    }
}
