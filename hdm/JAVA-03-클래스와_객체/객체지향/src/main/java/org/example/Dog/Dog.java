package org.example.Dog;

class Dog {
//    Dog(){} 기본생성자가 생략되어있음.

    String name; // 기본값으로 초기화됨 null
    int age; // 기본값 0임
    // 생성자에도 매개변수가 올 수 있음.
    // 생성자: 멤버필드를 초기화하는데 사용함.
    // 컴파일러는 프로그래머가 생성자를 하나라도 만들면, 기본생성자를 추가하지 않음.

    Dog(){

    }

    Dog(String name , int age){
        //this. 를 통해 구별가능
        // this. 내(생성된 인스턴스)가 가지고 있는
        // this. 객체 나 자신을 가리키는 참조값임.
        this.name = name;
        this.age = age;
    }
    Dog(String name){
//        this.name = name;
        this(name, 5); // 내가 이미 가지고 있는 생성자를 호출
        // 제약사항: 반드시 생성자 본문에 첫줄에 위치해야됨!!
    }
    //생성자 오버로딩 가능.
    Dog(int age){
    }

    Dog eat(){
        System.out.println("사료를 먹고..");
        return this;
    }
    void drink(){
        System.out.println("물 마심");
    }
}
