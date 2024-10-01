package org.example.Sort;

// 사용자 정의 클래스가 정렬하려면 비교 기준이 필요함.
// 제네릭: 비교하고자 하는 타입 클래스를 넣어줘야함.
public class Person implements Comparable<Person>{
    String name;
    int age;

    // 오버라이드 ctrl + o
    @Override
    public int hashCode() {
        // 일반적으로 String은 같은 문자열에 대해서 같은 해시코드가 나옴.
        return name.hashCode();
    }

    // 매개 변수가 같으면 true 아니면 false
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){ // 비교하고자 하는 obj가 Person 타입이라면
            Person p = (Person) obj;
            return this.age == p.age;

        }
        return false;
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;

    }

    @Override
    public int compareTo(Person o) {
        // 나이를 기준으로 비교?
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
