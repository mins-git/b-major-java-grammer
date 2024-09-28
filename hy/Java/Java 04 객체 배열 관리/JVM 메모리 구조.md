## JVM 메모리구조
- Java 언어는 메모리 관리를 개발자가 하지 않음
    - JVM에 의해 자동으로 관리됨
- GC(Garbage Collection): JVM은 가비지 컬렉터를 통해 자동으로 메모리를 관리, 사용되지 않는 객체를 메모리에서 해제

### JVM 메모리 영역
- **메서드 영역**
    - 클래스(또는 인터페이스)의 메서드, 필드와 같은 클래스 관련 정보 저장
    - 설계도 정보를 메모리에 미리 올려놓는다.
    - 메서드의 바이트코드 저장

- **힙 영역**
    - 모든 객체(인스턴스의 상태, 멤버 변수)와 배열, 문자열 상수 등이 저장

- **스택 영역**
    - 메서드 호출 시마다 프레임 생성. 
    - 프레임 안에는 로컬 변수. 메서드 호출 정보, 중간 연산 결과 등이 저장. 
    - 메서드가 종료되면 해당 프레임이 자동으로 제거 됨(마지막으로 호출된 메서드의 프레임이 먼저 제거 → LIFO).
        > 프레임이란? 함수와 호출과 관련된 정보를 저장하는 단위

#### JVM 동작 과정
1. 소스코드를 실행하면 class 로더(설계도)가 메서드 영역에 저장된다.
2. 메인 함수 실행 시 메인 함수가 스택에 올라간다.
3. 메인 메서드가 특정 메서드 호출 시 해당 메서드가 스택에 올라간다.
4. 메인 메서드가 객체 생성하면 힙 영역에 인스턴스가 생성되고, 메인 메서드의 지역 변수(스택 영역에 존재)에 인스턴스의 참조값이 들어간다.

### static 특징
1. 로딩 시점
    - static : 클래스 로딩 시
    - non-static(일반 멤버변수) : 객체 생성 시
2. 메모리상의 차이
    - static : 클래스당 하나의 메모리 공간만 할당
    - non-static : 인스턴스 당 메모리가 별도로 할당(인스턴스 변수)
3. 사용 목적
    - static : 모든 인스턴스에 공통으로 사용되는 메서드나 변수를 정의할 때 사용
    - non-static : 객체마다 개별적으로 관리되는 상태나 동작을 정의할 때 사용
4. 사용 방법 
    - static : 클래스 이름으로 접근
    - non-static : 객체 생성 후 객체 이름으로 접근
5. static 영역에서는 non-static 영역에 직접 접근 불가
6. non-static 영역에서는 static 영역에 접근 가능
7. 정적 초기화 블록
    - 클래스가 로드될 때 한 번 실행. 주로 정적 변수(static variables)를 초기화하는데 사용
    ```java
    public class Counter {
        // static 변수
        public static int staticCount = 0;
        
        // non-static 변수
        public int instanceCount = 0;
        
        // static 초기화 블록
        static {
            staticCount = 10;
        }

        // System.out.println(Counter.staticCount);
        // output: 10
    }
    ```

## 접근제어자
### 패키지
- 클래스와 관련 있는 인터페이스들을 모아두기 위한 이름 공간
    - 프로그램의 많은 클래스를 관리하기 위해 패키지를 이용한다.
- 패키지의 구분은 '.'(dot) 연산자를 이용한다.
- 패키지의 이름은 시중에 나와있는 패키지들과 구분되게 지어야 한다.
- 일반적으로 소속이나 회사의 도메인을 사용한다
    - 예: `com.ssafy.project_이름.module_이름`

### import
- 다른 패키지에 있는 클래스를 사용하기 위해서는 import 과정이 필요하다.
- PersonService.java에서 Person 클래스를 사용하기 위해서는 import 해야 한다.
    - import를 선언할 때는 import 키워드 뒤에 package 이름과 클래스 이름을 모두 입력
    - 해당 패키지의 모든 클래스를 포함할 때는 '*'을 사용하기도 한다.
        - 하위 패키지까지 가져오지는 않는다.
```java
import java.util.*;
import java.util.logging.Logger;    // 해당 import문 주석 시 Logger 클래스는 사용 불가
// *로 import 시 하위 패키지까지 가져오지는 않기 때문.

public class ImportTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        Date d;

        Logger 1;
    }
}
```

### 캡슐화
1. 객체의 속성(data fields)과 행위(메서드, methods)를 하나로 묶고
2. 실제 구현 내용 일부를 외부에 감추어 은닉한다.

### 접근 제어자
> 클래스, 멤버 변수, 멤버 메서드 등의 선언부에서 접근 허용 범위를 지정하는 역햘의 키워드

#### 종류
- public : 모든 위치에서 접근 가능
- protected : 같은 패키지에서만 접근 가능하고 다른 패키지에선 접근 불가능. 
    - 단, 다른 패키지의 클래스와 상속관계가 있을 경우 접근 가능(상속 후 상속받은 클래스를 통해서 접근 가능)
- (default) : 같은 패키지에서만 접근이 허용. 접근제어자가 선언이 안 되었을 경우 기본 적용
- private : 자신 클래스에서만 접근이 허용 

| 수식어 | 클래스 내부 | 동일 패키지 | (다른 패키지 내의) 하위 클래스 | 다른 패키지 |
|:-----:|:-----------:|:----------:|:----------:|:----------:|
|private|      O      |            |            |            |
|(default)|      O      |     O       |            |            | 
|protected|      O      |     O       |     O       |            | 
|public|      O      |        O    |       O    |     O       | 
- 클래스(외부)에는 public, default만 사용 가능
- 내부클래스, 멤버 변수, 메소드 : 4가지 모두 사용 가능

#### 그 외 제어자
- static : 클래스 레벨의 요소 설정
- final : 요소를 더 이상 수정할 수 없게 함
- abstract : 추상 메서드 및 추상 클래스 작성

```java
public class Person {
    
    // private : 자기 자신만 접근 가능하다.
    private String name;
    private int age;

    // 멤버메서드 : 자기 자신
    public void info() {
        name = "Kim"; // 자기 자신의 것 -> 접근 가능
        // 외부의 클래스에서는 접근 불가능 !
    }
}
```
```java
import pkgTest.Person;  // pkgTest 패키지(다른 패키지)의 Person 클래스 import하기

// Person 클래스를 PersonTest 클래스가 상속받음
public class PersonTest extends Person{
    public static void main (String[] args) {
        // Person p = new Person();
        // 다른 클래스에 있으면 기본적으로는 안됨!

        // 상속 후 상속받은 클래스를 통해서만 접근 가능
        PersonTest p2 = new PersonTest();
        p2.age = 10;        // Person 클래스의 멤버 변수(protected)

    }

}
```

### 접근자(getter) / 설정자(setter)
> 클래스에서 선언된 변수 중 접근제한에 의해 접근할 수 없는 변수의 경우 다른 클래스에서 접근할 수 없기 때문에, 접근하기 위한 메서드(설정자와 접근자)를 public으로 선언하여 사용

- 객체지향 방식(캡슐화)의 설계에서 기본적으로 멤버 변수는 보안을 위해 private으로 설정.
- 변수에 접근하는 통로는 메서드를 통해 만들고, 메서드는 public으로 열어놓는다.
- 접근자와 설정자를 쓰면 뭐가 좋을까?
    - 값을 변경하거나 가져오기 전에 보안 및 검사를 위한 로직을 추가할 수 있다.

```java
public class Person {
    private String name;
    private int age;
    private boolean hungry;

    // 접근자(getter) : 현재 객체의 멤버변수의 값을 반환해주는 함수.
    public int getAge() {
        return age;
    }

    // 설정자(setter) : 현재 객체의 멤버변수의 값을 변경 <= 새로운 값은 매개변수로 받는다.
    public void setAge(int age) {
        // 검사 로직 추가 가능
        if(age < 0) {
            System.out.println("나이는 음수가 될 수 없어요.");
            return; // 함수를 여기서 종료하고 나를 호출한 곳으로 되돌아감.
        }
        this.age = age;
    }
}
```

## 객체 배열 관리
### 객체 배열 관리란?
- 정보 관리 시스템 (예: 학사 관리 시스템)
- 캡슐화를 이용하여 클래스 작성
- DB 대신 배열을 사용해 객체의 정보를 저장
- 객체의 조회, 추가, 수정, 삭제(CRUD)를 구현
- 싱글턴 패턴을 사용하여 정보 관리 일원화
    - 하나의 객체가 배열을 관리한다.

### 싱글턴 패턴(Singleton Pattern)
1. 인스턴스는 최초 1개만 생성
2. 이후 생성자가 호출되면 이미 생성된 단 하나의 인스턴스를 재사용.

- 싱글턴 패턴을 따르는 클래스는 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이다.
    - 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 반환.

```java
public class ScoreManager {
    int score;

    // 2. 인스턴스는 내가 한개만 만들어서 가지고 있자.
    private static ScoreManager manager = new ScoreManager();

    // 점수를 관리하는 객체. 점수는 1개만 있음
    // -> 싱글턴으로 만들어보자.
    // 1. 오로지 1개만 생성되도록. 외부에서 생성자를 호출할 수 없도록 막아야 한다.
    //      - 생성자를 private으로
    private ScoreManager() {}

    // 3. 인스턴스를 외부에서 가져다 쓸 수 있도록 public으로 getter 추가
    // 4. 외부에서 객체 생성이 불가능하기 때문에 객체 생성 없이 바로 접근할 수 있도록 static 추가.
    public ScoreManager getInstance() {
        return manager;
    }
}
```
```java
public class ScoreTest {
    public static void main(String[] args) {
//      ScoreManager sm = new ScoreManager();   // 생성자가 private이므로 객체를 생성해서 쓸 수 없음.


        // 이미 생성된 객체를 getInstance 메서드를 이용해 가져오기.
        ScoreManager sm1 = ScoreManager.getInstance();
    }
}
```