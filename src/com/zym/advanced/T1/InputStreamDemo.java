package com.zym.advanced.T1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args){
        File file=new File("hello.txt");
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            byte[] bytes=new byte[(int) file.length()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
