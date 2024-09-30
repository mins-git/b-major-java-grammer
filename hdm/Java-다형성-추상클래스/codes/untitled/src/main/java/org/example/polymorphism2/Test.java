package org.example.polymorphism2;

public class Test {
    public static void main(String[] args) {
        // 다형성
        Person p = new Student(); // 다형성
        // 묵시적 형변환: 자손 타입=> 조상 타입

//        Student st = (Student) new Person(); // 되는것 처럼 보이나 안됨.
        // 컴파일은 되지만 실행중에 에러가 발생함
        // 컴파일: 문법적 오류만 검사함.
        // 명시적 형변환인데 에러가 나는 경우?
        // 자손 객체를 만든다음 부모 클래스로 형 변환 했다가, 다시 돌아오는 경우
        // ex)
//        Student st = (Student) p; // 부모를 자식 객체로 바꾼 후
//        Object obj = new Student();

        Person[] persons = new Person[3];

        persons[0] = new Person("park", 27);
        persons[1] = new Student("park", 27, "aa");
        persons[2] = new Student("park", 27, "cc");

        for(Person person: persons){
            if(person instanceof Student){ // 묵시적 형 변환이 가능하면 true 아니면 false
                System.out.println(person);
                ((Student)person).study();
            }
        }

    }
}
