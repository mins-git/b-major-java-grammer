package org.example.test_polymorphism;

// 특정 인터페이스를 구현
public class GalaxyPhone implements AlarmSound{
    @Override
    public void playAlarm() {
        System.out.println("딩동 딩동");
    }
}
