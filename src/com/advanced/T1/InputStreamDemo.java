package com.advanced.T1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
  public static void main(String[] args){
    File file=new File("hello.txt");
    FileInputStream fileInputStream=null;
    try {
      fileInputStream=new FileInputStream(file);
      byte[] bytes=new byte[(int) file.length()];
      fileInputStream.read(bytes);
      String str=new String(bytes);
      System.out.println(str);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      try {
        fileInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
