package org.example.inheritance;

public interface Speakable {
    int MEMBER_1 = 100;
    void speak();
    void eat(); // 인터페이스 다중 상속시 반환형 메서드 (매개변수가)이 겹쳐도 클래스에서
    // 어차피 구현부가 없기 때문에 상관없음
    // 클래스가 인터페이스를 구현하는 시점에 메서드 내용을 정의하면 되기에 상관 없다.

}
