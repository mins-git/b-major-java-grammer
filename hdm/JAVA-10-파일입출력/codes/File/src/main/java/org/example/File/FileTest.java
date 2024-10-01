package org.example.File;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        //File: 파일 & 디렉 관리 클래스
        File f = new File("pic.png");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isAbsolute());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length()+ " bytes.");

        File src = new File("src");
        System.out.println(src.exists());
    }
}
