package org.example.Generic.generic_box;



class Box<T>{
    private T t;

    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t = t;
    }

    
}


public class BoxTest {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<Integer>();
        Box<String> strBox = new Box<>(); // 생성자 호출부분에서 타입 생략 가능
        Box<Double> doubleBox = new Box<>();

        intBox.setT(43);
        strBox.setT("Hello");
        String value = strBox.getT(); // instanceof로 형변환 할 필요가 없다

        // instanceof는 Java에서 객체가 특정 클래스의 인스턴스인지 확인하는 데 사용되는 연산자
        int i1 = 11;
        Integer i2 = 11; //autoboxing : 기본형을 감싸서 자동으로 객체로 만들어줌.
        Integer i3 = Integer.valueOf(123); // 출력시 123 나옴.

    }
}
