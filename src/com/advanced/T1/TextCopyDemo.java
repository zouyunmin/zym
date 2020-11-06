package com.advanced.T1;

import java.io.*;

public class TextCopyDemo {
  public static void main(String[] args) {
    File file=new File("邓招良.txt");
    File file1=new File("C://王家桐.txt");
    try {
      FileReader fileReader=new FileReader(file);
      FileWriter fileWriter=new FileWriter(file1);
      char[] chars=new char[1];
      while(fileReader.read(chars)!=-1){
        fileWriter.write(chars);
      }
      fileReader.close();
      fileWriter.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
