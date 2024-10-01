# Set
- 특징 : 순서가 없고, 중복 허용x
- 장점: 빠른 속도, 효율적인 중복 데이터 제거 수단
- 단점: 단순 집합 개념으로 정렬하려면 별도의 처리가 필요함.
- 구현 클래스
    - HashSet
    - TreeSet


## Set 주요 메서드

| 메서드                              | 설명                                                                 |
|----------------------------------|--------------------------------------------------------------------|
| `add(E e)`                       | 데이터를 입력                                                       |
| `size()`                         | 입력된 데이터의 크기 반환                                            |
| `remove(Object o)`               | 지정된 데이터를 삭제                                                 |
| `clear()`                        | 모든 데이터를 삭제                                                   |
| `contains(Object o)`             | 지정된 객체가 포함되어 있는지 체크                                     |
| `isEmpty()`                      | 비어있는지 체크 (true/false 반환)                                    |
| `iterator()`                     | `Iterator` 인터페이스 객체 반환                                       |
| `toArray()`                      | `Set`의 내용을 `Object` 형 배열로 변환                                |

### 추가적인 메서드

| 메서드                              | 설명                                                                 |
|----------------------------------|--------------------------------------------------------------------|
| `retainAll(Collection<?> c)`     | `Set`에서 지정된 Collection에 포함된 요소만 남김                          |
| `removeAll(Collection<?> c)`     | `Set`에서 지정된 Collection의 모든 요소를 삭제                           |
| `addAll(Collection<? extends E> c)` | 주어진 Collection의 모든 요소를 추가                                  |
| `equals(Object o)`               | 주어진 객체와 현재 `Set`의 동일성을 비교                               |
| `hashCode()`                     | `Set`의 해시코드를 반환                                                |


### set을 사용하기 위해서는 hashcode(), equals 메서드를 오버라이드 해줘야한다.

- set을 사용하기 위해 hashCode()와 equals() 메서드를 오버라이드해야 한다는 것은, Java에서 Set 인터페이스를 구현한 컬렉션(예: HashSet)이 요소의 중복을 검사하는 방식과 관련됨.

    - equals(): 두 객체가 같은지를 비교. 만약 두 객체가 같은 것으로 판단된다면, 그 객체는 Set에 한 번만 추가되어야 함.

    - hashCode(): 객체의 해시 코드를 반환. 해시 코드는 객체를 해시 테이블에 저장할 때 사용되며, 서로 다른 객체라도 같은 해시 코드를 가질 수 있다. 하지만, 같은 해시 코드를 가진 객체는 equals() 메서드를 통해 실제로 같은 객체인지 확인해야 한다.

- 따라서, Set에 저장할 객체에 대해 이 두 메서드를 올바르게 구현하지 않으면, 중복된 요소가 추가될 수 있거나, 제대로 검색되지 않을 수 있다.

```java
// Person 클래스 오버라이드 예시
public class Person {
    private String name;
    private int age;

    // 생성자와 getter/setter 생략

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```