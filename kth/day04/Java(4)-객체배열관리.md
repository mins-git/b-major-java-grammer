# Java(4) - 객체 배열 관리

# JVM

- Java 언어는 메모리 관리를 개발자가 직접 하지 않음
- JVM이 자동으로 처리
- Garbage Collection
    - JVM은 가비지 컬렉터를 통해 자동으로 메모리 관리, 사용하지 않는 객체 메모리에서 제거

## JVM 메모리 영역

### 메서드 영역

- 클래스(또는 인터페이스)의 메서드, 필드와 같은 클래스 관련 정보 저장
- → 설계도 저장

### 힙 영역

- 모든 객체(인스턴스의 상태, 멤버 변수)와 배열, 문자열 상수, 풀이 저장

### 스택 영역

- 메서드 호출 시마다 프레임 생성. 프레임 안에는 로컬 변수, 메서드 호출 정보, 중간 연산 결과 등이 저장
- 메서드가 종료되면 해당 프레임이 자동으로 제거

## JVM 메모리 흐름

### 코드 작성 → 저장 → 컴파일

- 소스 코드 작성 → `*.java` 파일 생성 (프로젝트 디렉토리 `src/`에 위치)
- 컴파일 (IDE에서는 저장 시 자동으로 이루어짐) → `*.class` 파일 생성 (프로젝트 디렉토리 `bin/`에 위치)
- 파일 실행 (`*.class` 파일을 메모리로 읽어옴)

### 런타임

1. 메서드 영역에 클래스, 인터페이스 정보 올라감
2. main() 함수 호출 → 스택 영역에 프레임 할당
3. main() 함수가 다른 함수를 호출 → 스택 영역에 함수에 대응하는 프레임이 계속 쌓임
4. 함수가 객체를 생성함 → 해당 인스턴스 정보가 힙 영역에 올라감
    1. 객체를 생성한 프레임에는 지역변수가 생성되고, 힙 영역에 위치한 인스턴스의 참조값이 할당됨
- static 변수는 메서드 영역의 해당 클래스 정보 안에 올라간다.

# static

## 특징

### 1. 로딩 시점

- static: 클래스 로딩 시
- non-static: 객체 생성 시

### 2. 메모리 상 차이

- static: 클래스 하나당 하나의 메모리 공간만 할당
- non-static: 인스턴스 하나당 메모리가 별도로 할당 (인스턴스 변수, 상태)

### 3. 사용 목적

- static: **모든 인스턴스에 공통으로 사용**되는 메서드나 변수를 정의할 때
- non-static: 객체마다 개별적으로 관리되는 상태나 동작을 정의

### 4. **사용 방법**

- static: 클래스 이름으로 접근 (객체를 생성할 필요X)
- non-static: 객체 생성 후 접근 가능

### 5. static 영역에서는 non-static 영역을 직접 접근이 불가능

```java
public class Main {
    String str = "문장";
    
    public static void main(String[] args) {
        System.out.println(str);
    }
}
```

### 6. non-static 영역에서는 static 영역에 대한 접근이 가능

```java
public class Main {
    static String str = "문장";
    
    public void print() {
        System.out.println(str);
    }
}
```

### 7. 정적 초기화 블록: 클래스가 로드 될 때 한 번 실행. 주로 정적 변수 초기화 용도.

```java
public class Counter {
    // static 변수
    public static int staticCount = 0; // 초기화 방법1
    
    // non-static 변수
    public int instanceCount = 0;
    
    // static 초기화 블록
    static { // 초기화 방법2
        staticCount = 10;
    }
}   
```

## 패키지

- PC의 많은 파일을 관리하기 위해서 폴더를 이용한다
- == 프로그램의 많은 클래스를 관리하기 위해서 패키지를 이용한다.

- 클래스와 관련 있는 인터페이스를 모아두기 위한 이름 공간
- 패키지 구분은 .(dot) 연산자를 이용한다.
- 패키지 이름은 시중에 나와 있는 패키지와 구분되게 지어야 한다.
- 일반적으로 소속이나 회사의 도메인을 사용한다.
    - 예: `com.ssafy.project_이름.module_이름`

## import

- 다른 패키지에 있는 클래스를 사용하기 위해서는 import 과정이 필요하다.
- 예: `import package_name class_name;`
- 예: `import first_package_name.second_package_name class_name;`
- 예: `import package_name *;` → 클래스만, 하위 패키지까지 가져오지는 않 는다.

## 캡슐화 Encapsulation

- 객체의 속성과 행위를 하나로 묶는다.
- 실제 구현 내용 일부를 외부에 감추어 은닉한다.

---

# 접근제어자 access modifier

## 이해

- 현재 클래스에서 다른 클래스의 메서드, 멤버 변수 등에 접근하고자 할 때 적용하는 규칙이다.
- 다른 클래스, 메서드, 변수의 접근제어자가 기준이 된다.

## 종류

- public: 모든 위치에서 접근이 가능
- protected: 같은 패키지에서 접근 가능, 다른 패키지에서 접근 불가능. 다른 패키지의 하위 클래스에서는 접근 가능.
- (default): 같은 패키지에서만 접근 가능. 접근제어자 선언이 안 되어 있을 경우 기본 적용
- private: 자신 클래스에서만 접근 가능
- 그 외
    - static: 클래스 레벌의 요소 설정
    - final: 요소를 더 이상 수정할 수 없게 함
    - abstract: 추상 메서드 및 추상 클래스 작성

## 표

|  | 클래스 내부 | 동일 패키지 | (다른 패키지) 하위 클래스 | (다른 패키지) 다른 클래스 |
| --- | --- | --- | --- | --- |
| private | O |  |  |  |
| (default) | O | O |  |  |
| protected | O | O | O |  |
| public | O | O | O | O |

# 접근자 getter / 설정자 setter

```java
// 캡슐화
// 기본적으로 멤버 변수는 private, 변수에 접근하는 메서드는 public
// getter, setter 좋은 점은? 값을 get하거나 set 하기 전에 사전 작업(보안 등)을 추가할 수 있다.

public class Person {
    private String name;
    private int age;
    private boolean hungry;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
```

# 객체배열관리

## 싱글턴 패턴 Singleton Pattern

### 정의

- 싱글턴 패턴을 따르는 클래스는 생성자가 여러 차례 호출이 되더라도 **실제로 생성되는 객체는 하나**.
- 최초 생성 이후에 호출된 생성자는, 최초 생성자가 생성한 객체를 리턴

### 구조

```java
// 1. 파일을 실행하면
// 2. static 변수를 초기화한다.
// 3. 초기화 과정에서 생성자 메서드를 호출한다.
// 4. manager는 Manager 인스턴스 변수가 된다.
// 5. 이후 다른 클래스에서 getManager()를 통해 manager에 접근만 할 수 있다.

public class Manager {
    private static Manager manager = new Manager(); // 초기화 
    private Manager() {} // 생성자
    
    public static Manager getManager() { // getter
        return manager;
    }
}
```