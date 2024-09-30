# Java(5) - 상속

# UML 클래스 다이어그램

## 정의

- 통합 모델링 언어(Unified Modeling Language, ISO/IEC 19501 표준)에서 정의한 다이어그램
- 클래스 다이어그램은 그 중 하나

---

# 상속

## 특징

### 1. 확장성, 재사용성

- 부모 클래스의 생성자와 static 초기화 블록은 상속 X

### 2. 클래스 선언 시 extends 키워드 명시

- 자바는 다중 상속 허용X, 단일 상속 지원

### 3. 관계

- 부모(상위, Super) 클래스: Person
- 자식(하위, Sub) 클래스: Student

### 4. 접근

- 자식 클래스는 부모 클래스의 멤버 변수, 메서드를 자신의 것처럼 사용할 수 있음
- 접근제어자에 따라 사용 가능 여부가 달라진다

### 5. Object class

- Object class는 모든 클래스의 조상 클래스
- 별도의 extends 선언이 없는 클래스는 `extends Object`가 선언된 것

### 6. super 키워드

- **super()를 통해 부모 클래스의 생성자를 호출**
- **생성자 내부에서 super()를 선언하지 않았더라도, super(); 생략되어 있는 것과 같다.**

```java
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
}
```

```java
public class Student extends Person {
    String major;
    
    public Student(String name, int age, String major) {
        **super(name, age); // 생성자 내 최상단에 위치해야 함**
        this.major = major;
    }
    
    public void study() {
        System.out.println("공부를 한다.");
    }
}
```

### 7. 오버라이딩 (재정의, Overriding)

**정의**

- 상위 클래스에 선언된 **메서드**를 자식 클래스에서 재정의 하는 것.
- 반드시 상속 관계에 있을 때 가능하다.
- 하위 클래스의 접근제어자 범위가 상위 클래스보다 크거나 같아야 한다.
    - 부모 클래스의 메서드를 자식이 감출 수 없다.
- 조상보다 더 큰 예외를 던질 수 없다.
- 메서드의 이름, 반환형, 매개변수가 동일해야 한다.
- 매서드 상단에 `@Override` 어노테이션을 붙이는 것을 권장한다.

**코드**

```java
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
}
```

```java
public class Student extends Person {
    String major;
    
    public Student(String name, int age, String major) {
        **super(name, age); // 생성자 내 최상단에 위치해야 함**
        this.major = major;
    }
    
    // 메서드 오버라이딩
    public void eat() {
        System.out.println("지식을 먹는다.");
    }
}
```

# Object

## 정의

- 가장 최상위 클래스로 모든 클래스의 조상님
- Object의 멤버는 모든 클래스의 멤버

## 대표 메서드

- `.toString()`
- `.equals()`
    - 주소 비교
    - == 연산자와 기능이 같다.
    - c.f.) String에서 equals로 값을 비교할 수 있는 것은 String 클래스에서 오버라이딩 했기 때문이다.
- `.hashCode()`

# final

## 정의

- 해당 선언이 최종 상태. 결코 수정이 될 수 없음.
- final 클래스: 상속 금지
- final 메서드: overriding 금지
- final 변수: 더 이상 값을 바꿀 수 없음. 상수화.