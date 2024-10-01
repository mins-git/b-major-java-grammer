package org.example.test_polymorphism;

public class IPhone implements AlarmSound{

    @Override
    public void playAlarm() {
        System.out.println("아이폰 소리");
    }
}
