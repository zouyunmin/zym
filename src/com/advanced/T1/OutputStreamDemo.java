package com.advanced.T1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
  public static void main(String[] args) {
    File file=new File("邓招良.txt");
    try {
      FileOutputStream fileOutputStream=new FileOutputStream(file);
      String str="邓招良，王家桐，邓杨";
      byte[] bytes=str.getBytes();
      fileOutputStream.write(bytes);
      fileOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
