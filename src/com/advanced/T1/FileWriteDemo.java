package com.advanced.T1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
  public static void main(String[] args) {
    File file=new File("邓.txt");
    try {
      FileWriter fileWriter=new FileWriter(file);
      fileWriter.write("邓招良");
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
