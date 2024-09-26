# JAVA(3) 클래스와 객체

## 객체지향 프로그래밍

### 객체지향 프로그래밍(OOP, Object Oriented Programming)

- 객체(Object): 데이터와 관련된 알고리즘(메서드)를 하나의 단위로 묶어 놓은 것
- 객체지향 프로그래밍(OOP): 객체 단위로 코드를 작성하며, 객체 간의 상호작용으로 프로그램을 설계한다.
- 객체 모델링: 현실세계의 객체를 SW 객체로 설계하는 것

### **클래스(Class) : 틀, 템플릿이라고 이해**

- 객체를 만들기 위한 설계도(Blueprint)

### **인스턴스(Instance)**

- 클래스를 통해 생성된 객체(찍어낸 객체): 실제 메모리에 생성된다.
- 객체는 일반적 용어이며, 인스턴스는 특정 클래스를 이용해 생성된 하나의 객체
- 인스턴스는 클래스의 한 사례(특정 클래스를 사용해서 객체를 생성하는 맥락)

### **객체지향 프로그래밍의 특징 (A PIE): 상속, 인터페이스와 관련**

- 면접에서 물어본다면 다음과같이 답하는게 모범답변이다.
- Abstraction(추상화): 객체의 불필요한 세부사항을 숨기고, 필요한 인터페이스만을 제공, 구현에 의존하지 않는 설계
- Polymorphism(다형성): 상속 또는 구현 관계에 있을 때 객체들이 서로 다른 방식으로 동작하는 것
- Inheritance(상속): 기존의 설계도를 재사용(확장), 하나의 클래스가 다른 클래스의 속성과 메서드를 물려받는 것
- Encapsulation(캡슐화): 객체의 데이터와 메서드를 하나로 묶고, 외부로부터 객체의 세부 사항을 숨기는 것

### **객체지향 프로그래밍의 장점**

- 코드의 재사용성
- 유지보수성(특정 객체만 오류가 뜬다면 그것만 수정하면 됨)
- 유연성과 확장성(코드의 재사용성과 비슷한 맥락, 기능을 쉽게 추가하고 수정할 수 있다.)

## 클래스(Class)

```java
package class01;

public class PersonTest {
	public static void main(String[] args) {
		String yang_name = "Yang";
		int yang_age = 45;
		String yang_hobby = "YouTube";
		
		String hong_name = "Hong";
		int hong_age = 25;
		String hong_hobby ="Golf";
		
		// --- 변수가 너무 많다 => 배열로!
		
		int SIZE = 2;
		String[] names = new String[SIZE];
		int[] ages = new int[SIZE];
		String[] hobbies = new String[SIZE];
		
		names[0] = "Yang"; // (index - 사람의 정보)가 사실은 연관성이 없다.
		names[1] = "Hong"; // 임의로 관계를 맺어줘야 한다.
		ages[0] = 45;
		ages[1] = 25;
		hobbies[0] = "YouTube";
		hobbies[1] = "Golf";
	}
}

```

코드가 너무 길다. 하나의 변수에 다양한 정보를 묶는다. → Class

```java
package class02;

// 클래스 생성: class 키워드 이용
// class 클래스이름 {}
class Person {
	String name;
	int age;
	String hobby;
}
```

```java
package class02;

public class PersonTest {
	
	public static void main(String[] args) {
		
		// 클래스를 가지고 객체를 생성
		// 클래스이름 객체의변수이름 = new 클래스이름();
		Person yang = new Person();
		
		// . (이 객체가 가지고 있는)
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "YouTube";
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		
	}

}
```

## **함수**

- 특정 작업을 수행하는 문장들의 모임
- 이름을 붙인 것
- 실행 가능한 단위
- 함수의 구성 요소: 반환타입 (or void), 함수이름, 매개변수, 함수 몸체
- 자바에서는 함수가 클래스의 일부분으로서 존재(메서드: 객체의 멤버 함수)

```java
package class05;

// 클래스 생성: class 키워드 이용
// class 클래스이름 {}
class Person {
	// 데이터
	// 멤버 변수
	String name;
	int age;
	String hobby;
	
	// 관련된 데이터와 로직을 하나로 묶어준다.
	// 멤버 메서드
	// 멤버 변수는 객체(인스턴스) 자기 자신이 가지고 있는 것이므로
	// 굳이 매개변수로 넘기지 않아도 접근 가능.
	// static: 클래스(설계도)
	// public void info()에서 public 생략 가능
	void info() {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"세입니다.");
		System.out.println("취미는 "+hobby+"입니다.");
	}
}

```

```java
package class05;

public class PersonTest {
	
	public static void main(String[] args) {
		
		// 클래스를 가지고 객체를 생성
		// 클래스이름 객체의변수이름 = new 클래스이름();
		Person yang = new Person();
		
		// . (이 객체가 가지고 있는)
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "YouTube";
		
		yang.info();
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		
		hong.info(); // 그 데이터와 연관된. 메서드.
		
//		
//		info(yang.name, yang.age, yang.hobby);
//		info(hong.name, hong.age, hong.hobby);
		
		// 함수를 이용할 때의 문제점은?
		// 이 함수는 생각해보니.. Person 과 밀접하게 관련된 로직.
	}
}
```

### **클래스**

- 관련 있는 변수와 함수를 묶어서 만든 사용자 정의 <데이터타입>
    
    member field: 멤버 변수, 객체의 속성, 상태
    
    member method: 멤버 메서드, 객체의 동작, 행위(로직)
    
- 객체를 생성하는 데 사용하는 청사진(Blueprint)
- 객체를 생성하는 틀
- 프로그래밍의 목적을 고려하여 클래스를 설계하고 객체를 생성
- 각 객체들이 어떤 특징(속성과 동작)을 가지고 있을지 결정한다.
- 클래스를 통해 생성된 객체를 인스턴스라고 한다.
- 객체들은 메서드를 통해 상호작용한다.(서로 메세지를 주고 받는다.)
- 데이터와 메서드를 하나로 묶어 캡슐화한다.
- 멤버 메서드에서는 멤버 변수에 대한 접근이 자유롭다(매개변수로 넘길 필요가 없다)

### **클래스(설계도)의 구성 요소**

- 멤버 변수(member Field)- 속성(Attribute)
- 멤버 메서드(member Method)- 동작(Behavior)
- 생성자(constructor)
- 중첩 클래스(nested class)

### **클래스 선언문법**

```java
[접근제어자] [final|abstract] class 클래스이름 {

	// 멤버 변수, 필드(속성 정의)
	[접근제어자] [static] [final] 데이터타입 변수이름 [=초기값];

	// 생성자
	[접근제어자] 클래스이름([매개변수들]) {
		생성자 본문
	}

	// 메서드(기능 정의)
	[접근제어자] [static] [final] [반환타입|void] 메서드이름([매개변수들]){
		메서드 본문
	}

}
이렇게 읽으면 헷갈리니 참고만 하자
```

### **객체 생성 문법**

```java
클래스이름 객체이름 = new 클래스이름([생성자 매개변수들]);
```

### **객체 멤버 접근**

- .연산자를 사용
    
    멤버 변수의 값 접근 
    
    >> 객체이름.멤버변수이름
    
    멤버 메서드 호출
    
    >> 객체이름.멤버메서드이름([매개변수들]);
    

### **변수의 종류**

| 변수 종류 | 선언 | 생성 시기 | 특징 | 메모리 영역 |
| --- | --- | --- | --- | --- |
| 클래스 변수 | 클래스에서 멤버 필드 선언 시 static 키워드 사용 | 클래스가 메모리에 로드될 때 생성 | 모든 인스턴스가 공유하는 변수 | 메서드 영역 |
| 인스턴스 변수 | 클래스에서 멤버 필드 선언 시 static 키워드 없이 선언 | 인스턴스가 생성될 때 생성 | 각 인스턴스마다 별도로 생성 | 힙 영역 |
| 지역 변수(local) | 메서드, 생성자 또는 초기화 블록 내에서 선언 | 선언된 블록이 실행될 때 생성 | 블록이 끝나면 소멸 | 스택 영역 |

### **메서드(Method)**

- 객체게 할 수 있는 행동을 정의
- 어떤 작업을 수행하는 명령문의 집합에 이름을 붙여놓은 것
- 메서드의 이름은 소문자로 시작하는 것이 관례

```java
[접근제어자] [활용제어자] 반환타입 메서드이름([매개변수들]) {
	메서드 본문
}
```

### **메서드 선언**

- 선언시 {} 안에 메서드가 해야 할 일을 정의

### **메서드 호출**

- 객체를 생성한 후 객체의 멤버 메서드를 호출한다.
- 클래스 객체.메서드이름 으로 호출
    
    ```java
    Person p = new Person();
    p.info();
    ```
    
- static이 메서드에 선언되어 있을 때는 클래스이름.메서드이름으로 호출
    
    ```java
    Person.hello();
    ```
    
- 매개변수(Parameter): 메서드에서 사용하는 것
- 인자(Argument): 호출하는 쪽에서 전달하는 것
- 매개변수는 생략 가능
- 파라미터 전달 시 묵시적 형 변환

### **메서드 오버로딩**

- 이름이 같고 매개변수가 다른 메서드를 여러 개 정의하는 것
- 중복 코드에 대한 효율적인 관리 가능
- 파라미터의 개수 또는 순서, 타입이 달라야 할 것(파라미터 이름만 다른 것은 X)
- 리턴 타입이 다른 것은 의미X

```java
package class06;

// 클래스 생성: class 키워드 이용
// class 클래스이름 {}
class Person {
	// 데이터
	// 멤버 변수
	String name;
	int age;
	String hobby;
	
	// 매개변수가 없는 메서드
	void info() {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"세입니다.");
		System.out.println("취미는 "+hobby+"입니다.");
	}
	
	// 매개변수가 있는 메서드
	void study(int time) {
		// int time = (호출할 때 넘겨준 값);
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	// 메서드 오버로딩
	// - 이름이 같으면서 매개변수가 다른 메서드를 정의.
	// - 파라미터의 타입, 개수, 순서가 달라야 한다.
	
	void study(long time) {
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	void study(double time) {
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	void study(String time) {
		System.out.println(time +"시간 동안 공부합니다.");
	}
	
	// - 순서가 다른 것: 오버로딩 가능.
	void study(int time, String subject) {
		System.out.println(subject+"를"+time +"시간 동안 공부합니다.");
	}
	
	void study(String subject, int time) {
		System.out.println(subject+"를"+time +"시간 동안 공부합니다.");
	}
	
	// 변수 이름만 다른 것 : 안됨
	// 빨간줄이 뜨면 안된다!
//	void study(String subject) {
//		
//	}
}

package class06;

public class PersonTest {
	
	public static void main(String[] args) {
		// 메서드의 호출: 1. 객체를 생성, 2. .연산자 사용.
		Person p = new Person();
		
		// 묵시적 형변환 가능.
		p.study((byte)2);
		p.study((short)10);
		p.study('A');
		p.study(10);
		
		// 묵시적 형 변환으로 안된다면?
		// => 메서드 오버로딩으로 처리할 수 있다.
		p.study(10L);
		p.study(10.3f);
		p.study(10.5);
		p.study("10");
	}
}

```

### **생성자**

- new 키워드와 함께 호출하여 객체 생성: 객체를 생성할 때 사용됨
- 클래스명과 이름이 동일: 생성자는 클래스와 동일한 이름을 가짐
- 반환 타입이 없다: 생성자는 반환 타입을 가지지 않음 (void x)
- 객체가 생성될 때 반드시 하나의 생성자 호출
- 멤버 필드의 초기화: 생성자는 객체의 멤버 필드를 초기화하는 데 주로 사용됨
- 기본 생성자(매개변수가 없고 내용이 없는 생성자)의 자동 제공
- 생성자 오버로딩: 매개변수의 개수나 타입이 다른 여러 개의 생성자를 정의할 수 있다
- this()를 사용한 생성자 호출: 생성자의 첫 번째 라인에서 this()를 사용하여 같은 클래스의 다른 생성자를 호출할 수 있음

### **기본(디폴트) 생성자**

- 클래스에 생성자가 하나도 정의되지 않을 경우 컴파일러가 자동으로 추가하는 생성자
- 접근제어자: 클래스의 접근제어자와 동일
- 형태: 매개변수와 본문 내용이 없는 형태
- [접근제어자] 클래스명() {}

```java
package class07;

class Dog 
	Dog(){
		System.out.println("기본생성자가 호출되었어요.");
	}
}

```

```java
package class07;

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}

```

### **파라미터가 있는 생성자**

- 생성자의 목적이 필드 초기화
- 생성자 호출 시 값을 넘겨주어야 함
- 해당 생성자를 작성하면 컴파일러가 기본생성자를 추가하지 않음

```java
package class08;

class Dog {
	String name;
	int age;
	
	// 생성자에도 매개변수가 올 수있다.
	// 생성자: 멤버필드를 초기화하는데 사용.
	// 프로그래머가 생성자를 하나라도 만든다면,
	// 컴파일러는 기본생성자를 추가하지 않는다.
	// 기본 생성자는 왠만하면 만드는게 좋다(상속)
	
	Dog(){
		
	}
	
	// 뭔가 좀 불편하다..
	Dog(String name, int age){
		// this.를 통해 구별한다.
		// this. : 내(생성된 인스턴스)가 가지고 있는
		// this: 객체(실제로 메모리에 생성된 인스턴스)나자신을 가리키는 참조값 != 설계도 아님
		this.name = name;
		this.age = age;
	}
	
	Dog(String name){
//		this.name = name;
//		this.age = 5;
		this(name, 5); // 내가 이미 가지고 있는 생성자를 호출
		// 제약사항: 반드시 생성자 본문에서 첫줄에 위치!!
	}
	
	Dog(int age){
//		this.name = "무명..";
		this("무명", age);
	}
	
	Dog eat(){
		System.out.println("사료를 먹고....");
		return this;
	}
	
	void drink() {
		System.out.println("물을 마십니다 :)");
	}
}

```

```java
package class08;

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog("메리", 4);
		System.out.println(d.name);
		System.out.println(d.age);
		
		Dog d2 = new Dog(); // 컴파일러가 기본생성자를 안만들어줘서.
		
		d2.eat().drink(); // 메서드 체이닝
		
	}
}

```

### this

- 참조 변수로써 현재 인스턴스 자기 자신을 가리킴
- this와 .연산자를 이용하여 자신의 멤버 접근 가능
- 지역변수(매개변수)와 필드의 이름이 동일할 경우 필드임을 식별할 수 있게 함(생성자에서 주로 활용)
- 인스턴스에 대한 참조이므로 static 메서드 또는 static 블록에서 this 사용 불가
- 메서드 체이닝(Method chaining): 메서드에서 this를 반환하여 메서드 호출을 연쇄적으로 이어갈 수 있음
- this([생성자매개변수들])를 호출하여 생성자 안에서 같은 클래스 내의 다른 생성자를 호출
    
    this()를 이용한 생성자 호출은 반드시 생성자 내에서만 가능
    
    this() 구문을 생성자 안에서 사용할 때는 반드시 첫번째 줄에 위치