package org.example.test_polymorphism;


// 이 인터페이스를 구현한 객체는
// 반드시 알람 기능이 있는걸 보장함
// => 약속의 의미임.
// 그 객체의 기능을 맘편하게 쓸 수 있음.
public interface AlarmSound {
    void playAlarm();
}
