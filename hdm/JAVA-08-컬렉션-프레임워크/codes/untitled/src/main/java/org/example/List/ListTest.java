package org.example.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
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

    }
}
