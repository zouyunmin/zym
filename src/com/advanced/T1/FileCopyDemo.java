package com.advanced.T1;

import java.io.*;

public class FileCopyDemo {
  public static void main(String[] args) {
    File file=new File("D://HBuilderX//HBuilderX.exe");
    File newfile=new File("C://h.exe");
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      FileOutputStream fileOutputStream = new FileOutputStream(newfile);
      byte[] bytes=new byte[(int) file.length()];
      fileInputStream.read(bytes);
      fileOutputStream.write(bytes);

      fileInputStream.close();
      fileOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
