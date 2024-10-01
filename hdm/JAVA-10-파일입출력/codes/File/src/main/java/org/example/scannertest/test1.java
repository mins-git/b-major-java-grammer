package org.example.scannertest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        method3();
    }

    private static void method3() {
        try(Scanner sc = new Scanner(new FileInputStream("input.txt"))){
            while(sc.hasNext()){
                int num = sc.nextInt();
            }
            System.out.println("scanner");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
