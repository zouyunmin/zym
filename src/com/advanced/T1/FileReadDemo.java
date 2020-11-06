package com.advanced.T1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
  public static void main(String[] args) {
    File file=new File("邓招良.txt");
    try {
      FileReader fileReader=new FileReader(file);
      char[] chars=new char[(int) file.length()];
      fileReader.read(chars);
      System.out.print(chars);
//      for (int i=0;i<file.length();i++){
//        System.out.println(chars[i]);
//      }
      fileReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
