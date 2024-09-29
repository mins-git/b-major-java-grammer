# Java(8) - 컬렉션 프레임워크

# 컬렉션 프레임워크

### 구성요소

- 주요 인터페이스
- 구현 클래스
- 유틸리티 클래스

### 주요 인터페이스

- Collection: List, Set, Queue 등 컬렉션의 상위 인터페이스
- List: 순서가 있는 컬렉션. 중복을 허용.
- Set: 중복을 허용하지 않는 컬렉션
- Queue: FIFO 방식의 컬렉션
- Deque: 양쪽 끝에서 요소의 삽입/삭제가 가능한 컬렉션
- Map<K, V>: 키-값 쌍으로 이루어진 요소의 컬렉션

### 주요 구현 클래스

- ArrayList: 동적 배열로 구현된 List
- LinkedList: 이중 연결 리스트로 구현된 List와 Deque
- Stack: LIFO 방식의 컬렉션
- HashSet: 해시 테이블 기반의 Set
- HashMap<K, V>: 해시 테이블 기반의 Map
- PriorityQueue: 힙 기반의 우선순위 큐

### 유틸리티 클래스

- Collections: 컬렉션 객체의 정렬, 검색 등을 위한 정적 메서드 제공
- Arrays: 배열을 다루기 위한 유틸리티 메서드 제공

### 계층도

![image.png](Java(8)%20-%20%E1%84%8F%E1%85%A5%E1%86%AF%E1%84%85%E1%85%A6%E1%86%A8%E1%84%89%E1%85%A7%E1%86%AB%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%B7%E1%84%8B%E1%85%AF%E1%84%8F%E1%85%B3%201108bd5c31708083b08beba902041707/f9d05fc3-e1d0-4bc3-803f-b59b6231b7f8.png)

# List

### 특징

- 순서가 있고 중복을 허용 (배열과 유사)
- 내부적으로 배열을 이용하여 데이터를 관리 → ArrayList, Vector
- 배열과 다르게 크기가 유동적으로 변함 (동적 자료구조)
- 배열을 다루는 것과 유사하게 사용할 수 있음

### 구현 클래스

- ArrayList
- LinkedList
- Vector (옛날 JDK)

## Array

- 같은 타입의 데이터를 묶어 사용하는 자료구조
- 접근 속도가 빠름 → 효율적
- 정적 자료구조. 추가 데이터를 넣을 때, 새로운 배열을 만들고 복사함
- 데이터 삭제 시, 인덱스를 재조정하기 위해 전체 데이터를 옮겨야 함 → 비효율적
- ArrayList는 Array를 활용하므로 이 같은 특징을 가지고 있음

## LinkedList

- 데이터를 저장하는 노드들을 연결한 자료구조
- 각 노드는 데이터와 다음 노드를 가리키는 포인터로 구성
- 데이터의 삽입과 삭제가 빠름 (포인터만 변경하면 됨)
- 특정 인덱스의 데이터를 찾기 위해서는 처음부터 순차적으로 탐색해야 함 → 접근 속도가 느림
- ArrayList에 비해 데이터의 추가/삭제는 빠르지만, 조회는 느림

### 활용 코드

```java
import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// List
		// - 순서도 있고, 중복도 허용
		
		List<String> names = new ArrayList<String>();
		
		// 원소의 추가
		names.add("luna");
		names.add("max");
		names.add("daisy");
		names.add("max");
		
//		System.out.println(names);
		
		// 리스트가 비어있는지 체크
//		System.out.println(names.isEmpty());
		
		// 수정
		names.set(0, "emily");
//		System.out.println(names);
		
		// 조회
//		System.out.println(names.get(3));
		
		// 순회
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		
		// 삭제
		// 인덱스를 이용한 삭제
		names.remove(0);
//		System.out.println(names);
		
		// 값을 이용한 삭제
		names.remove("daisy");
//		System.out.println(names);
		
		names.remove("max");
//		System.out.println(names);
		// 똑같은 값이 여러 개 있다면, 하나만 지워진다.
		
		// 전부 삭제
		names.clear();
//		System.out.println(names);
//		System.out.println(names.isEmpty());
		
		// 삭제를 할 때 주의할점
		// - 중복된 값이 있을 때
		names.add("max");
		names.add("max");
		names.add("luna");
		
		System.out.println(names);
		
		// max를 다 지우고 싶다.
		// => for문을 돌면서 순회를 하면서, 일치하는 애들은 전부 지워버린다.
//		for(int i=0; i<names.size(); i++) {
//			if(names.get(i).equals("max"))
//				names.remove(i);
//		}
		
		for(int i=names.size()-1; i>=0; i--) {
		if(names.get(i).equals("max"))
			names.remove(i);
		}
		
		System.out.println(names);
		
		
		
	}
}
```

---

# Set

### 특징

- 특징: 순서가 없고, 중복을 허용하지 않음
- 장점: 빠른 속도, 효율적인 중복 데이터 제거 수단
- 단점: 단순 집합의 개념으로 정렬하려면 별도의 처리가 필요하다
- 구현 클래스: HashSet, TreeSet

### 주의사항

- Set을 사용하기 위해서는 hashCode(), equals() 메서드를 오버라이드 해줘야 한다.

### 활용 코드

```java
import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		// Set
		// - 순서도 없고, 중복도 허용하지 않는 자료구조
		// - 집합을 나타내는 자료구조
		// - 구현체로 HashSet을 사용
		// - java.util
		// - 중복을 허용하지 않으므로 => 동일성 판단
		// - 동일성 판단 : hashcode & equals 메서드
		
		Set<String> names = new HashSet<>();
		
		names.add("luna");
		names.add("max");
		names.add("luna");
		names.add("daisy");
		names.add("max");
		
		System.out.println(names); //
		
//		System.out.println("luna".hashCode());
//		System.out.println("max".hashCode());
//		System.out.println("daisy".hashCode());	
	}
}
```

```java
import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("luna", 3));
		set.add(new Person("luna", 3));
		
		
		// set에는 한 사람? 아니면 두 사람?
		// set이 같다고 판단하는 기준: hashcode가 같으면서 equals 값도 같아야함.
		System.out.println(set);
		
		// 사용자 정의 클래스를 사용하는 경우
		// Set을 사용하기 위해서는 hashCode(), equals()메서드를 오버라이드 해줘야 한다.
	}
}
```

# Map

### 특징

- 특징: Key, Value를 하나의 Entry로 묶어서 데이터 관리, 순서는 없으며, 키에 대한 중복은 없음
- 장점: 빠른 속도
- 구현 클래스: HashMap, TreeMap

```java
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		// Map
		// - 사전과 같은 자료구조
		// - 키 & 값의 쌍으로 구성되어 있음
		// - 키는 구별이 되어야 함(중복허용하지 않음, 순서도 없음)
		// - 값은 중복될 수 있다.
		
		// Map<키자료형,값자료형> map = new HashMap<>();
		
		// Map의 키자료형으로 사용자 정의 클래스가 온다면?
		// Set의 경우와 마찬가지로 hashCode(), equals() 메서드를 오버라이드 해줘야 함.
		
		Map<String, String> map = new HashMap<>();
		
		map.put("luna", "cat");
		map.put("max", "dog");
		map.put("daisy", "cow");
		map.put("toby", "cat");
		map.put("luna", "dog");
		// 키는 중복이 되지 않고, 만약에 똑같은 키에 새로운 값을 넣으면
		// 새로운 값으로 수정된다.
		
//		System.out.println(map);
		
//		System.out.println(map.get("daisy"));
		
		// 키가 있는지 확인
//		System.out.println(map.containsKey("max"));
		
		// 값이 있는지 확인
//		System.out.println(map.containsValue("horse"));
//		System.out.println(map.containsValue("dog"));
		
		// 맵의 순회
		// 1. keySet();
		for(String key : map.keySet()) {
			System.out.printf("%s : %s \n", key, map.get(key));
		}
		
		// 2. entrySet(); => Entry : 키- 값의 쌍
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.printf("%s : %s \n", entry.getKey(), entry.getValue());
		}
	}
}

```

---

# Queue

- 큐는 인터페이스이다. 구현 클래스는 LinkedList를 사용한다.
- FIFO
- 주요 메서드
    - boolean offer(E e):  추가
    - E peek(): 가장 앞에 있는 데이터 조회
    - E poll(): 가장 앞에 있는 데이터 꺼내기
    - boolean isEmpty(): 큐가 비어 있는지 여부 반환

### 활용 코드

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		// Queue
		// - FIFO
		// - Queue 인터페이스
		// - LinkedList를 구현체로 사용.
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 값을 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		// queue.offer(), queue.add() : 둘다 추가
		// 예외처리와 관련해서 차이가 있을 수는 있음.
		
		// 값을 하나씩 꺼내기
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
		while(!queue.isEmpty()) { // 큐가 비어있지 않다면
			System.out.println(queue.poll());
		}

	}
}
```

# Stack

- Stack 클래스를 사용한다.
- LIFO
- 주요 메서드
    - E push(E e): 추가
    - E peek(): 최상단 데이터 조회
    - E pop(): 최상단 데이터 꺼내기
    - boolean isEmpty(): 스택이 비어 있는지 여부 반환

### 활용 코드

```java
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		// 인터페이스 분리
		// - 구현체가 달라질 수 있다
		// List: ArrayList, LinkedList, ..
		
		// Stack
		// - 단일 클래스
		// - LIFO
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.add(2);
		stack.push(3);
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		stack.peek(); // 값을 꺼내지는 않고(삭제는 하지 않고) 조회만 할때
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()); // 조회 + 삭제
		}
	}
}
```

# Deque

- deque은 인터페이스
- 구현체는 ArrayDeque, LinkedList를 사용한다.
- 양쪽 끝에서 자유롭게 원소의 추가, 삭제 가능
- 주요 메서드
    - addFirst(E e): 맨 앞에 데이터를 추가
    - addLast(E e): 맨 뒤에 데이터를 추가
    - E removeFirst(): 가장 앞에 있는 데이터 제거
    - E removeLast(): 가장 뒤에 있는 데이터 제거
    - E peekFirst(): 가장 앞에 있는 데이터 조회
    - E peekLast():  가장 뒤에 있는 데이터 조회
    - boolean isEmpty(): 덱이 비어 있는지 여부 검사

### 활용 코드

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
	public static void main(String[] args) {
		// Deque
		// - Deque: 인터페이스
		// - 구현체: ArrayDeque, LinkedList
		// - 양쪽 끝에서 자유롭게 자료의 추가, 삭제 가능
		
		// 객체배열관리 실습 : array <= 실제로 배열을 가지고 리스트를 만들어 본 것임
		// 중간에 삭제, 중간에 추가...
		// 중간에서 삭제 추가가 빈번하게 일어나는 상황
		// array : 조회는 빠르다. 
		
		// LinkedList: 조회는 느리다. 삭제&추가는 빠름.
		
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("alice");
		deque.addFirst("luna");
		deque.addLast("max");
		deque.addFirst("daisy");
		
		System.out.println(deque);
		
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());
		
		
	}
}

```

---

# 정렬

### 특징

- 요소들을 특정 기준에 맞추어 오름차순 또는 내림차순으로 재배치
- 순서를 가지는 Collection만 정렬 가능 (List)
- Collections의 sort()를 이용한 정렬

## Comparable interface

- 사용자 정의 클래스에서 정렬할 때 이 인터페이스를 구현한다.
- compareTo 함수의 파라미터 변수의 의미
    - 양수: 자리 바꿈
    - 음수: 자리 유지
    - 0: 동일 위치
- 구조
    
    ```java
    public interface Comparable<T> {
        public int compareTo(T o);
    }
    ```
    

### 활용 코드

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		// 정렬
		// - 순서가 있는 자료구조: List
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("daisy", 3));
		persons.add(new Person("luna", 3));
		persons.add(new Person("max", 3));
		persons.add(new Person("alice", 2));
		
		System.out.println(persons);
		
		// 정렬
		// Collections 유틸리티 클래스의
		// sort() 메서드 사용
		
		Collections.sort(persons); 
		// 사용자 정의클래스를 사용한 리스트는 기본적으로 정렬할 수 없음!
		// Comparable 인터페이스 구현 or Comparator 클래스를 정의
		// - 비교 기준이 없으므로 사용자 정의 클래스에 비교 기준을 만들어준다.
		
		// 문자 => 정수로 표현(0~65535)
		System.out.println(persons);
		// 만약 숫자의 리스트였다면 수의 크기의 오름차순으로 정렬.

	}
}

```

## Comparator

- 객체가 Comparable을 구현하고 있지 않거나, 사용자 정의 알고리즘으로 정렬하려는 경우
- sort(List<T> list, Comparator<? Super T> c)
- 구조
    
    ```java
    public interface Comparator<T> {
        int compare(T o1, T o2);
    }
    ```
    

### 활용 코드

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		// 정렬
		// - 순서가 있는 자료구조: List
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("daisy", 3));
		persons.add(new Person("luna", 3));
		persons.add(new Person("max", 3));
		persons.add(new Person("alice", 2));
		
		System.out.println(persons);
		
		// 정렬
		// Collections 유틸리티 클래스의
		// sort() 메서드 사용
		
		Collections.sort(persons, new PersonComparator()); 
		// 사용자 정의클래스를 사용한 리스트는 기본적으로 정렬할 수 없음!
		// Comparable 인터페이스 구현 or 사용자 정의 Comparator 클래스를 정의(Comparator 인터페이스를 구현해서)
		// - 비교 기준이 없으므로 사용자 정의 클래스에 비교 기준을 만들어준다.
		
		// 문자 => 정수로 표현(0~65535)
		System.out.println(persons);
		// 만약 숫자의 리스트였다면 수의 크기의 오름차순으로 정렬.

	}
}

```