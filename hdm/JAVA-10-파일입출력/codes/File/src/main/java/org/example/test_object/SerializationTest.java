package org.example.test_object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {
        Person p = new Person("LUNA", 5);

        // 객체 > 파일에 저장
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("luna.dat"))){
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
