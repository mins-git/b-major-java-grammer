package org.example.ExceptionTEST.test03;

public class ThrowsTest1 {
    
    // ChecedException: 컴파일러가 예외 처리를 강제!
    // try ~ catch로 예외처리르 직접 하던지, throws로 전달.
    // thorws의 의미?
    // 1. 미안하지만 이 메서드에서 처리하지 않을게.
    // 이 메서드를 사용하는 사람이 예외 처리를 해서 쓰도록 해.
    // 2. 이 메서드를 사용한 프로그래머는 이 메서드는 checedexception을 발생시킬 수 있는 메서드구나
    // 내가 이 메서드를 쓰려면 내가 예외 처리 해야겠네
    // 3. checkedexception은 원래 무조건 처리해야되는데 메서드 선언에다가 thorws를 한번만 봐줄게임.
    // 그런데 이 메서드를 호출하는 곳에서는 예외에 관련된 내용을 처리해줘야해.
    // 프로그램의 시작점인 main 메서드 조차 throws하면 결국 예외는 처리되지 않음.
    // - 비정상적 종료가 되겠지?

    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    private static void method1() throws ClassNotFoundException {
        method2();
    }

    static void method2() throws ClassNotFoundException {
        Class.forName("Hello");
    }
}
