package org.example.byte_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteSteamTest1 {
    public static void main(String[] args) {
        // bytestream으로 이미지 출력
        // stream > close() 진행해주기. > finally에서 close()

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("pic.png");
            fos = new FileOutputStream("pic-copy.png");

            int b; // byte 바구니

            while((b = fis.read()) != -1) { //하나의 바이트를 읽어와서 있으면
                fos.write(b); // 출력스트림에 써
            }
            System.out.println("복사 끝");
        } catch (IOException e) {

        } finally{
            try {
                if(fis != null)
                    fis.close(); // null.close(); runtime error발생 가능.
                if(fis != null)
                    fos.close(); //
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
