# JAVA(4) 객체배열관리

**JVM 메모리구조**

- JAVA언어는 메모리 관리를 개발자가 하지 않음: 메모리 관리는 JVM에 의해 자동으로 처리
- GC(Garbage Collection): JVM은 가비지 컬렉터를 통해 자동으로 메모리를 관리, 사용되지 않는 객체를 메모리에서 해제
- JVM의 메모리 영역: 메서드, 힙, 스택
    
    **메서드 영역(Method Area)**
    
    : 클래스또는 인터페이스의 메서드, 필드와 같은 클래스관련 설계도가 저장되는 장소, 설계도 정보를 메모리에 미리 올려놓는다고 생각
    
    → 클래스와 관련된 정보를 저장하는 영역(메서드의 바이트코드 저장)
    
    **힙 영역(Heap)**
    
    : 모든객체(인스턴스의 상태, 변수)와 배열, 문자열 상수 등이 저장 
    
    → 인스턴스가 생성되는 공간(인스턴스의 상태 저장)
    
    **스택 영역(Stack)**
    
    : 접시거치대라고 생각, 메서드 호출시마다 프레임이 생성, 프레임 안에는 로컬 변수, 메서드호출정보, 중간 연산 결과 등이 저장, 메서드가 종료되면 해당 프레임이 자동으로 제거됨 (LIFO 구조를 따름, Last In First Out)
    
    → 메서드 수행시 프레임이 할당됨, 필요한 변수나 중간결과 값을 임시 기억하는 곳, 메서드 종료시 할당메모리 자동제거
    

### **Static 특징**

- 로딩시점
    
    static: 클래스 로딩 시
    
    non-static: 객체 생성 시
    
- 메모리 상의 차이
    
    static: 클래스당 하나의 메모리 공간만 할당
    
    non-static: 인스턴스 당 메모리가 별도로 할당(인스턴스 변수, 상태)
    
- 사용 목적
    
    static: 모든 인스턴스에 공통으로 사용되는 메서드나 변수를 정의할 때 사용
    
    non-static: 객체마다 개별적으로 관리되는 상태나 동작을 정의할 때 사용
    
- 사용 방법
    
    static: 클래스 이름으로 접근
    
    non-static: 객체(인스턴스) 생성 후 접근
    
    ```java
    package modifier00_jvm_static;
    
    public class Person {
    	
    	// static 변수
    	// - 클래스(설계도)에 이미 들어있는 변수.
    	// - 인스턴스 생성과 무관, 이전에 이미 있다.
    	// - 설계도가 메서드영역에 로딩되는 시점에.
    	// - 설계도에 들어있는 것이므로,
    	//   이 설계도로 만드는 모든 인스턴스에 공유된다.
    	// - 클래스이름.static변수 : 클래스 이름으로 바로 접근가능하다.
    	static int pCount = 100;
    	
    	// 아래의 변수들은?
    	// - 인스턴스 변수, 멤버 변수
    	// - non static
    	// - 실제 인스턴스가 생성이 될 때, 힙 영역에 만들어진다.
    	// - 객체 생성 후에, 해당 객체의 이름으로만 접근가능
    	// - this : 각각의 인스턴스가 자기 자신을 가리키는 참조.
    	String name;
        int age;
        String hobby;
        
        static {
        	pCount = 1000;
        }
        
        // static 메서드 (설계도)
        public static void main(String[] args) {
    		// name = "Kim"; static에서는 non-static 접근 불가.
    	}
        
        // non-static
        public void info() {
        	pCount = 300; // non-static에서는 static 접근 가능.
        }
    }
    
    package modifier00_jvm_static;
    
    public class PersonTest {
        public static void main(String[] args) {
        	// static변수는 클래스 이름으로 바로 접근 가능하다.
        	System.out.println(Person.pCount);
        	
        	Person p = new Person();
        	p.pCount = 200; // static 변수는 모든 인스턴스가 공유한다.
        	System.out.println(p.pCount); // 노란줄이 뜬다.
        	// 인스턴스를 통해서도 접근은 되지만, 클래스이름으로 접근하는 것을 권장.
        	
        }
    }
    
    ```
    
- static 영역에서는 non-static 영역에 직접 접근 불가능하다
- non-static 영역에서는 static 영역에 대한 접근이 가능하다
- 정적 초기화 블록(Static Initialization Block)
    
    클래스가 로드될 때 한 번 실행, 주로 정적 변수(static variables)를 초기화하는 데 사용
    
    ```java
    public class Counter {
    	//static 변수
    	public static int staticCount = 0;
    
    	//non-static 변수
    	public int instanceCount = 0;
    
    	//static 초기화 블록
    	static {
    		staticCount = 10;
    	}
    }
    ```
    

### **접근제어자**

- 패키지
    
    PC의 많은 파일을 관리하기 위해서 폴더를 이용한다.
    
    프로그램의 많은 클래스를 관리하기 위해서 패키지를 이용한다.
    
    com.ssafy.project_이름.module_이름
    
    패키지는 클래스와 관련 있는 인터페이스들을 모아두기 위한 이름 공간
    
    패키지의 구분은 .(dot) 연산자를 이용한다.
    
    패키지의 이름은 시중에 나와 있는 패키지들과 구분되게 지어야 한다.
    
    일반적으로 소속이나 회사의 도메인을 사용한다.
    
- import
    
    다른 패키지에 있는 클래스를 사용하기 위해서는 import과정이 필요하다
    
    import package_name.class_name;
    import package_name.*;  →모든 클래스를 포함, 하위패키지는 x
    
- 캡슐화(Encapsulation)
    
    객체의 속성(data fields)과 행위(메서드)를 하나로 묶고 실제 구현 내용 일부를 외부에 감추어 은닉한다
    
- 접근 제어자(access modifier)
    
    클래스, 멤버 변수, 멤버 메서드 등의 선언부에서 접근 허용 범위를 지정하는 역할의 키워드이다
    
    **접근 제어자의 종류**
    
    public: 모든 위치에서 접근이 가능
    
    protected: 같은 패키지에서 접근이 가능, 다른 패키지 접근 불가능. 단, 다른 패키지의 클래스와 상속관계가 있을 경우 접근 가능
    
    defualt: 같은 패키지에서만 접근이 허용, 접근제어자가 선언이 안 되었을 경우 기본 적용
    
    private: 자신 클래스에서만 접근이 허용
    
    클래스(외부)사용가능: public, default
    
    내부클래스, 멤버변수, 메서드 사용가능: 4가지 모두 가능
    
    - 그 외 제어자
    
    static: 클래스 레벨의 요소 설정
    
    final: 요소를 더 이상 수정할 수 없게 함
    
    abstract: 추상 메서드 및 추상 클래스 작성
    
    | 수식어 | 클래스 내부 | 동일 패키지 | (다른 패키지 내의)하위 클래스 | 다른 패키지 |
    | --- | --- | --- | --- | --- |
    | private | o |  |  |  |
    | (default) | o | o |  |  |
    | protected | o | o | o |  |
    | public | o | o | o | o |

### **접근자(getter)/설정자(setter)**

클래스에서 선언된 변수 중 접근제한에 의해 접근할 수 없는 변수의 경우 다른 클래스에서 접근할 수 없기 때문에, 접근하기 위한 메서드(설정자와 접근자)를 public으로 선언하여 사용

- 접근자(getter)
    
    현재 객체의 멤버변수의 값을 반환해주는 함수
    
    매개변수는 없고 반환유형은 해당변수와 같은 타입이다.
    
- 설정자(setter)
    
    현재 객체의 멤버변수의 값을 변경, 새로운 값은 매개변수로 받는다.
    
    반환유형은 없고 해당변수와 같은 타입의 데이터를 매개변수로 받아서 해당변수에 대입한다.
    

### **객체배열관리**

- 싱글턴 패턴(Singleton Pattern)
    
    소프트웨어 디자인 패턴에서 싱글턴 패턴(Singleton pattern)을 따르는 클래스는 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴
    
- 객체 배열 관리란?
    
    정보 관리 시스템 ex)학사 관리 시스템
    
    캡슐화를 이용하여 클래스를 작성
    
    DB 대신 배열을 사용해 객체의 정보를 저장
    
    객체의 조회, 추가, 수정, 삭제(CRUD)를 구현
    
    싱글턴 패턴을 사용하여 정보 관리 일원화