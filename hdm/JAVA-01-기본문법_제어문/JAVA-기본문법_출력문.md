## JVM (Java virtual machine)
- 자바 바이트코드를 실행할 수 있는 주체임.
- 자바 바이트코드를 기계어로 번역하여 특정 플랫폼의 실제 하드웨어에서 실행함.
- 바이트코드: 소스코드와 기계어 사이의 중간 단계를 말함.
    - 바이트 코드는 플랫폼에 독립적이다.
- JVM은 플랫폼 독립성을 가능하게한다.
    - JVM 자체는 플랫폼 종속적이긴함

```java
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
```

- 자동완성은 ctrl + spacebar로 사용 가능함.
```java
public class jkava01_intro0 {
	// main + ctrl + spacebar
	public static void main(String[] args) {
		//sysout + ctrl + spacebar
		System.out.println();
	}
}
```

### 주석은 //로 쉽게 사용 가능.
- `/* */` 와 같이 여러줄의 주석으로 사용 가능.

## 출력문
- print 메서드:
    - 줄바꿈을 하지 않음. 필요시 \n 사용.
- pirntln :
    - 값을 출력한 후 줄바꿈
- printf:
    - `%d`: 정수 / `%f`:실수 / `%c`:문자 / `%s` 문자열 로 출력 가능.
    - ex) `System.out.printf("%d\n", 10);` 와 같이 사용 가능.
        - d 앞에 숫자를 적으면 ~칸 확보할지 체크해볼 수 있음.
        - ex) ("%4d\n", 10) 적용시 앞에 4칸을 확보하고 `    10`이 출력됨.
 

