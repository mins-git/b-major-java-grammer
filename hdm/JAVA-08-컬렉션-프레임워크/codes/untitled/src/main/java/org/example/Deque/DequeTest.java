package org.example.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {


        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("allice");
        deque.addLast("mimi");
        deque.addFirst("kiki");
        deque.addLast("nana");

        System.out.println(deque);

        System.out.println(deque.removeLast());

    }
}
