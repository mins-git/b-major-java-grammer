# Map
- 특징: Key와 Value 값을 하나의 Entry로 묶어서 데이터 관리. 순서는 없으며 키에 대한 중복은 없음
- 장점: 빠른속도
- 구현 클래스 : Hash Map, Tree Map


## Map 주요 메서드

| 메서드                                  | 설명                                                                 |
|--------------------------------------|--------------------------------------------------------------------|
| `put(K key, V value)`                | 주어진 키와 값을 맵에 추가                                           |
| `get(Object key)`                    | 주어진 키에 대응하는 값을 반환                                        |
| `remove(Object key)`                 | 주어진 키에 대응하는 값을 맵에서 삭제                                 |
| `containsKey(Object key)`            | 맵에 주어진 키가 포함되어 있는지 확인                                  |
| `containsValue(Object value)`        | 맵에 주어진 값이 포함되어 있는지 확인                                  |
| `clear()`                            | 모든 키와 값을 맵에서 삭제                                            |
| `keySet()`                           | 맵의 모든 키를 `Set` 형태로 반환                                      |
| `values()`                           | 맵의 모든 값을 `Collection` 형태로 반환                               |
| `isEmpty()`                          | 맵이 비어있는지 확인 (true/false 반환)                                |
| `size()`                             | 맵에 저장된 항목의 개수를 반환                                        |


