package org.example.Interface;


// 키워드 interface -> 인터페이스
public interface SomeInterface {

    // public static final이 생략되어 있음.
    // 인터페이스의 모든 변수는 사실 상수임(static)
    /* public static final*/ int MEMBER_1 = 10;
    public static final int MEMBER_2 = 20;

    // 모든 메서드가 추상메서드임
    // 모든 메서드 앞에 public abstract가 생략됨.
    void method1();
    public abstract void method2();



}
