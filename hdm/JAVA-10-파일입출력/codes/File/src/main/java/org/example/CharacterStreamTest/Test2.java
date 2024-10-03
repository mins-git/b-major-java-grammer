package org.example.CharacterStreamTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        // Reader/ Writer
        try(FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("input3.txt");
        ){
            int c; // 버퍼를 채운 개수
            char[] buffer = new char[10];
            while((c = reader.read(buffer)) != -1){
                writer.write(buffer,0, c);
            }
            System.out.println("복사 끝");
        }catch(IOException e){
        }
    }
}
