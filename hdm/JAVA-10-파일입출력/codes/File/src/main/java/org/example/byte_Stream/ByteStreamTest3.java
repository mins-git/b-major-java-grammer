package org.example.byte_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest3 {
    public static void main(String[] args) {
        // try with resources

        try(FileInputStream fis = new FileInputStream("pic.png");
            FileOutputStream fos = new FileOutputStream("pic-cpoy-3.png")
        ){
            int b; // 버퍼에 쓴 바이트 개수가 됨.
            // 버터를 이용해서 read()
            byte[] buffer = new byte[10];

            while((b= fis.read(buffer)) != -1){ // 입력스트림으로부터 버퍼에 바이트를 채우고
                System.out.println(b);
                fos.write(buffer, 0, b); // 채운 바이트 수를 반환
            }
            System.out.println("끝");

        } catch(IOException e){

        }
        System.out.println("스트림은 알아서 닫혔습니다.");
    }
}
