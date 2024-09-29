# Java(7) - 인터페이스, 제네릭

# 인터페이스 Interface

## 특징

- 완벽히 추상화된 설계도
- 클래스와 유사하게 작성되지만 class 대신 interface 키워드 사용
- 기본적으로 모든 메서드가 추상 메서드 (JDK8부터 default 메서드와 static 메서드도 포함될 수 있음)
- 인터페이스 내에 선언된 메서드는 public abstract가 기본으로 생략되어 있음
- 인터페이스 내에 정의된 변수는 자동으로 public static final로 간주되며, 생략할 수 있음.

## 구조

```java
public **interface** 인터페이스이름 {
    (**public static final**) 타입 상수이름1 = 10;
    타입 상수이름 상수이름2 = 10;
    ㅌㅂ
    (**public abstract**) 반환형 메서드이름1([매개변수, ...]); <- 세미콜론을 보아하니 내용이 없겠군. 이라고 유추.
    반환형 메서드이름2([매개변수, ...]);
}
```

## 인터페이스의 구현

- 인터페이스는 그 자체로 인스턴스를 생성할 수 없음 (구현부가 없으므로)
- 객체를 생성하기 위해서 먼저 인터페이스를 구현하는 클래스를 만들고, 클래스를 이용해 객체 생성
- 클래스가 인터페이스를 구현할 경우 `implements` 키워드를 사용
- 클래스는 여러 개의 인터페이스를 다중 구현 가능
    - 예: `A implements B, C`
    - 클래스 다중 상속을 막아둔 것은 메서드 혹은 변수명이 겹칠 수 있기 때문. 그러나 인터페이스는 그럴 위험이 없다. 구현부가 없기 때문에.
    - 자세한 것은 ‘diamond problem’ 키워드로 검색하자.
- 클래스는 인터페이스의 추상 메서드를 모두 구현(재정의)해야 객체 생성 가능.
    - 하나로도 재정의 하지 않을 경우 추상 클래스가 됨
- 형식
    
    ```java
    interface Shape {}
    interface AnotherShape {}
    
    class Circle extends Shape {} // X
    class Circle implements Shape {} // O
    class AnotherShape extends Shape {} // O (같은 인터페이스끼리는 extends 가능)
    ```
    

## 인터페이스와 다형성

- 인터페이스를 구현한 클래스로 만든 객체는 해당 인터페이스 타입을 참조할 수 있음
- 동적 바인딩: 런타임 시점에서는 실제 객체의 메서드가 호출
- 다형성? (복습)
    - 상속 관계에 있을 때 조상 클래스의 타입으로 자식 클래스의 객체를 참조할 수 있다.

## 인터페이스 상속

- extends 키워드를 이용하여 인터페이스끼리 상속
- 클래스와 달리 인터페이스는 다중 상속이 가능
- 예시
    
    ```java
    interface Movable {
        public abstract void move();
    }
    
    interface Cookable {
        public abstract void cook();
    }
    
    interface Chef extends Movable, Cookable {}
    
    class Robot implements Chef {
        @Override
        public void move() {...}
        
        @Override
        public void cook() {...}
    }
    ```
    

## default 메서드

### 특징

- 인터페이스에 구현부가 있는 메서드 작성 가능
- 메서드 앞에 default 키워드
- public 접근제어자 사용해야 함. 생략 가능.
- 목적: 인터페이스의 하위 호환성을 유지하면서 새로운 메서드 추가
- 클래스에서 인터페이스의 default 메서드를 재정의할 수 있음
- 구조
    
    ```java
    public interface MyInterface {
        void abstractMethod();
        
        default void defaultMethod() {
            System.out.println("This is a default method.");
        }
    }
    ```
    

## static 메서드

### 특징

- 클래스의 static 메서드와 사용법 동일
- 인터페이스 이름으로 메서드에 접근
- 유틸리티 메서드나 헬퍼 메서드 제공
- 인터페이스를 구현한 클래스에서 상속되거나 재정의 할 수 없음

## 추상화

- 불필요한 세부 사항을 숨기고 중요한 특징이나 기능에 집중하는 것
- 공통의 인터페이스를 정의하고, 구체적인 구현은 하위 클래스에 맡김
- 보다 추상화된 클래스(상위 클래스, 추상 클래스, 인터페이스)에 의존. 연관된 코드 작성
    - 외부의 코드를 단순화하고 관심사의 분리를 강화하는 추상화의 한 유형
- 구체적인 클래스들의 공통점을 뽑아 그룹화하여 상위(추상) 클래스, 또는 인터페이스를 만들고, 상속 및 구현을 이용하여 코드 중복을 해결하는 계층적 코드 쳬계의 재조직 과정
- 현실 세계의 구체적 실체에서 SW객체를 모델링하는 과정에서 소프트웨어의 목적에 맞는 특징, 행위만 추출하는 과정 → 추상화 행동과 상태가 있으며, 다른 객체와 상호작용하는 추상적 객체를 정의하는 기능
- 객체지향 프로그래밍에서 abstraction은 선언되었을 경우(자바에선느 abstract 클래스 혹은 interface) 그 자체로 객체 생성 불가를 의미하며, 객체 생성을 위해서는 프로그래머에게 구현을 강제하는 책임이 있음을 의미
- 캡슐화: 상태 세부 정보를 숨기고, 데이터 타입과 행동을 강하게 연관시키며 데이터 타입 간의 상호작용을 표준화하는 것.
- 다형성: 추상화가 진행되어 서로 다른 타입의 객체에 의해 대체될 수 있게 하는 것.
- 상속: 추상화가 상위 클래스, 추상 클래스, 인터페이스를 만들고 상속, 구현하는 과정에서 이루어짐.

## 클래스 vs 인터페이스

|  | 클래스 | 인터페이스 |
| --- | --- | --- |
| 특징 | - class 키워드를 사용하여 정의
- 필드와 메서드, 생성자로 이루어짐 | - interface 키워드
- (public static final) 상수
- (public abstract) 추상 메서드 |
| 관계 | 인터페이스를 구현함 | 클래스에 의해 구현됨 |
| 멤버 변수 | 선언 가능 | (static) 상수만 가능 |
| 다중 상속 | 단일 상속O 다중 상속X | 인터페이스는 여러 개의 인터페이스 상속 가능
(구현부가 없으므로 문제 X) |
| 다중 구현 | 여러 개의 인터페이스를 다중 구현 가능 |  |
| 인스턴스 | 생성 가능 | 생성 불가 |
| 타입 | 타입으로 사용 가능 | 타입으로 사용 가능 |

## 추상 클래스 vs 인터페이스

|  | 추상 클래스 | 인터페이스 |
| --- | --- | --- |
| 객체 생성 | 불가 | 불가 |
| 일반 메서드 | 가능 | 불가 |
| 일반 필드 | 가능 | 불가(static 상수만 가능) |
| 메서드 | abstract를 붙여야만 추상 메서드 | 모든 메서드는 추상 메서드 (default, static 가능) |
| 사용 | - 추상적인 클래스의 성격을 가질 때 (일부 메서드만 미완성인 설계도)
- **서로 유사한 클래스 사이에** 코드를 공유하고 싶을 때 | - **서로 관련 없는 클래스 사이에** 공통으로 적용되는 ****인터페이스를 구현하기를 원할 때 (ex. Comparable, Serializable)
- 객체(클래스)의 성격이라기보다 어떤 기능을 구현하고 있다는 약속의 성격이 있을 때 |
| 공통점 | - 특정 기능의 구현을 강제하고 싶을 때
- 다형성 가능
- 보다 추상화된 설계도에 의존하는 코드
- 타입으로 사용 가능 | 좌동 |

---

# 제네릭 Generic

## 정의

- 다양한 타입의 객체, 데이터를 처리할 수 있도록 클래스, 인터페이스, 메서드를 작성하는 기법
- 타입 매개변수를 사용하여 코드의 재사용성을 높이고 타입 안정성을 보장

### 예시

```java
class Box <T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        // 제네릭 클래스의 사용: 사용 시점에 타입 매개변수에 타입을 전달
        Box<Integer< intBox = new Box<Integer>();
        Box<String> strBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
    }
    
    // boxing <-> unboxing
    int num1 = 11; // 객체가 아님
    Integer num2 = 11; // auto-boxing: 기본 타입을 감싸서 객체로 만듦
    int num3 = num2; // auto-unboxing: 객체 타입을 기본 타입 변수로 만듦
}
```

### 제네릭 클래스 선언

- 클래스 또는 인터페이스 선언 시 <>에 타입 파라미터 표시
    - 예시
        
        ```java
        public class ClassName<T>{}
        public interface InterfaceName<T>{}
        ```
        
- 타입 파라미터 → 특별한 의미의 알파벳X. 단순 임의의 참조형 타입을 말함.
    - T: reference Type
    - E: Element
    - K: Key
    - V: Value

### 제네릭 클래스 객체 생성

- 변수와 생성 쪽의 타입은 반드시 일치해야 함
    - Box<Student> box = new Box<Student>(); → O
    - Box<Person> box = new Box<Student>(); → X
- 추정이 가능한 경우 타입 생략 가능 (호출 쪽, 생성자 쪽)

### 제네릭 메서드

- 타입 파라미터를 사용하는 메서드
- 클래스의 타입 파라미터와는 별개로, 메서드 레벨에서 제네릭 타입을 정의하고 사용할 수 있음
- 제네릭 메서드는 메서드의 매개변수나 반환 타입을 타입 파라미터로 지정하여 다양한 타입을 처리
- 제네릭 메서드를 정의하려면 메서드의 반환 타입 앞에 타입 파라미터를 선언
    
    ```java
    public <U> void printClassName(U item) {
        System.out.println("Item type: " + item.getClass().getName());
    }
    ```
    
- 메서드를 호출할 때 타입 파라미터 생략 가능
    - 명시할 때는 메서드명 앞, .(dot)연산자 사이에 <타입>을 표시
    
    ```java
    IntegerBox.printClassName("Test String")
    IntegerBox.<Double>printClassName(12.5);
    ```
    

### 한정된 타입 매개변수

- 제네릭 클래스를 정의할 때
    - 모든 종류의 타입에 대해서 작성하는 게 아니라 특정한 종류의 타입에 대해서만 작성하고 싶은 경우
    - 구체적인 타입의 제한이 필요할 때 `extends`키워드를 사용할 수 있음
- 클래스가 아닌 인터페이스로 제한할 경우도 `extends`키워드 사용
- 클래스와 함께 인터페이스 제약 조건을 이용할 경우 `&` 로 연결

```java
// Person과 그 자식, 자손 타입만 가능

class Box<T extends Person> {
    private T obj;
    public T getObj() { return obj; }
    public void setObj(T obj) { this.obj = obj; }
}
```

## 와일드 카드

- 제네릭 클래스 인스턴스 변수의 참조 타입을 작성할 때(변수 선언시)
- 불특정 타입을 나타내기 위해 사용하는 특수한 타입 매개변수
- **타입이 구체적으로 정해진 제네릭 클래스들의 부모 타입으로서 사용 가능**
- 제네릭 클래스에 다형성 적용 가능
- 와일드 카드의 종류
    
    
    | 종류 | 표현 | 설명 |
    | --- | --- | --- |
    | 제한없는 와일드 카드 | `GenericType<?>` | 타입에 제한이 없음 |
    | 상한 경계 와일드 카드 | `GenericType<? extends T>` | T와 T를 상속받은 타입들만 사용 가능 |
    | 하한 경계 와일드 카드 | `GenericType<? super T>` | T와 T의 조상 타입만 사용 가능 |