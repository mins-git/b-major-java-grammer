package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // 사전과 같은 자료구조
        // 키 & 값 쌍으로 구성
        // 키는 구별되어야 함(중복 허용x 순서도 없음)
        // 값은 중ㅂ족될 수 있다.

        // Set의 경우와 마찬가지로 키자료형으로 사용자 정의 클래스가 온다면
        // hashcode, equals 메서드 오버라이드 필요함.

        Map<String, String> map = new HashMap<>();

        map.put("luna", "cat");
        map.put("max", "dog");
        map.put("mini","human");

        // 만약 똑같은 키에 새로운 값을 넣으면 새로운 값으로 수정됨.

        System.out.println(map);
        // 키가 있는지 확인
        System.out.println(map.containsKey("luna"));


        // 맵의 순회
        // key set()
        for (String key: map.keySet()){
            System.out.printf("%s : %s \n", key, map.get(key) );
        }


    }
}
