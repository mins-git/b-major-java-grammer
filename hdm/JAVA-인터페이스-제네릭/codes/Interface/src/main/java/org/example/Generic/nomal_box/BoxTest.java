package org.example.Generic.nomal_box;


class Box {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box(); // 아무거나 다 넣기 가능

        box.setObj(11);
        box.setObj("Hello");

        Object obj = box.getObj(); // 꺼낼때 Object로 꺼내야함.
        // 값을 사용하기 위해서는 일일이 형변환 필요

    }
}
