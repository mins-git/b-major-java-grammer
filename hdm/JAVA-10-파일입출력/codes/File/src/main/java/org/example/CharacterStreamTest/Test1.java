package org.example.CharacterStreamTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        // Reader/ Writer
        try(FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("input2.txt");
        ){
            int c;
            while((c = reader.read()) != -1){
                writer.write(c);
            }
            System.out.println("복사 끝");
        }catch(IOException e){
        }
    }
}
