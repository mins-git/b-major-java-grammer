package org.example.Stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.add(2);
        stack.push(3);
        // 거꾸로나옴.
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        // 값은 꺼내지 않고 조회만 진행
        System.out.println(stack.peek()); // 3
        System.out.println(stack.peek()); // 3
        System.out.println(stack.peek()); // 3



    }
}
