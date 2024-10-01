
## Collection 인터페이스

- `List`, `Set`, `Queue`의 상위 인터페이스

### Collection 인터페이스의 주요 메서드
| 메서드                          | 설명                                                                                   |
|--------------------------------|--------------------------------------------------------------------------------------|
| `boolean add(E e)`             | 컬렉션에 요소를 추가. 요소가 성공적으로 추가되면 `true`를 반환하고, 그렇지 않으면 `false`를 반환 |
| `boolean remove(Object o)`      | 컬렉션에서 지정된 요소를 제거. 요소가 성공적으로 제거되면 `true`를 반환하고, 그렇지 않으면 `false`를 반환 |
| `boolean contains(Object o)`    | 컬렉션에 지정된 요소가 포함되어 있는지 확인. 포함되어 있으면 `true`를 반환하고, 그렇지 않으면 `false`를 반환 |
| `int size()`                   | 컬렉션의 요소 개수를 반환                                                               |
| `void clear()`                 | 컬렉션의 모든 요소를 제거                                                              |
| `Iterator<E> iterator()`        | 컬렉션의 요소들을 반복할 수 있는 `Iterator` 객체를 반환                                   |
| `Object[] toArray()`           | 컬렉션의 모든 요소를 포함하는 배열을 반환                                               |


## LIST
### ArrayList 주요 메서드

| 메서드                              | 설명                                                                   |
|----------------------------------|----------------------------------------------------------------------|
| `add(E e)`                       | 데이터를 입력                                                         |
| `get(int index)`                 | 해당 인덱스의 데이터를 추출                                            |
| `size()`                         | 입력된 데이터의 크기 반환                                              |
| `remove(int i)`                  | 해당 인덱스의 데이터를 삭제                                             |
| `remove(Object o)`               | 지정된 데이터를 삭제                                                   |
| `clear()`                        | 모든 데이터를 삭제                                                     |
| `contains(Object o)`             | 지정된 객체가 포함되어 있는지 체크                                       |
| `isEmpty()`                      | 비어있는지 체크 (true/false 반환)                                      |
| `addAll(Collection c)`           | 기존 등록된 Collection 데이터를 입력                                    |
| `iterator()`                     | `Iterator` 인터페이스 객체 반환                                         |

### 추가적인 메서드

| 메서드                              | 설명                                                                   |
|----------------------------------|----------------------------------------------------------------------|
| `indexOf(Object o)`              | 지정된 객체가 처음으로 등장하는 인덱스를 반환, 객체가 없으면 -1 반환            |
| `lastIndexOf(Object o)`          | 지정된 객체가 마지막으로 등장하는 인덱스를 반환, 객체가 없으면 -1 반환           |
| `subList(int fromIndex, int toIndex)` | 부분 리스트를 반환 (`fromIndex` 포함, `toIndex`는 제외)                    |
| `toArray()`                      | 리스트의 모든 데이터를 배열로 변환하여 반환                                    |
| `set(int index, E element)`      | 지정된 인덱스에 있는 데이터를 주어진 요소로 업데이트                              |
| `ensureCapacity(int minCapacity)` | 리스트의 용량을 최소 `minCapacity`로 보장                                     |
| `trimToSize()`                   | 리스트의 크기를 현재 요소의 수에 맞게 조정                                      |
| `retainAll(Collection<?> c)`     | 리스트에서 주어진 Collection에 있는 요소만 남기고 나머지를 삭제                  |
| `removeAll(Collection<?> c)`     | 리스트에서 주어진 Collection에 포함된 모든 요소를 삭제                           |

#### 예시
```java
        // list생성
        List<String> names = new ArrayList<>();

        names.add("luna");
        names.add("maz");
        names.add("maz3");
        System.out.println(names);

        // 리스트 비었나 체크하기
        System.out.println(names.isEmpty());

        // 리스트 수정하기
        names.set(0, "mini");
        System.out.println(names);

        // 조회
        System.out.println(names.get(2));

        //순회
        for(String name:names){
            System.out.println(name);
        }

        // 삭제[ 인덱스를 이용한 삭제]
        names.remove(0);
        // 특정 이름 삭제 [ 값을 이용한 삭제 ]
        names.remove("maz");

        // 전부 삭제
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
```

## LinkedList
- 각 요소를 Node로 정의학 Node는 다음 요소의 참조 값과 데이터로 구성됨.
