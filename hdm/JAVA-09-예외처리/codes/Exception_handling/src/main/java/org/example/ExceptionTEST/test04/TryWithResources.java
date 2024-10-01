package org.example.ExceptionTEST.test04;

//import java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        // try with resources 구문 사용
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            // 파일을 읽는 로직 추가
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류 발생.");
        }
    }
}