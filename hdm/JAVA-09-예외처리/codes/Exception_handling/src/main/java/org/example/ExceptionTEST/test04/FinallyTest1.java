package org.example.ExceptionTEST.test04;

public class FinallyTest1 {
    public static void main(String[] args) {
        int[] nums = {10};

//        System.out.println(nums[2]);

        try {
            System.out.println("1 정상코드");
            System.out.println(nums[1]); // array indexoutofbounds..
//            int i = 1 / 0 ; // java 에서는 숫자를 0으로 나누면 예외발생
            System.out.println("1 정상코드");

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("배열의 인덱스를 벗어 났어요!");
        } finally {
            System.out.println("4");
        }
        System.out.println("프로그램 종료");

        }

    }


