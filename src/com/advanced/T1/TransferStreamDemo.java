package com.advanced.T1;

import java.io.*;

public class TransferStreamDemo {
  public static void main(String[] args) {
    try {
      FileInputStream fileInputStream=new FileInputStream(new File("邓招良.txt"));
      InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
      char[] chars=new char[1];
      while (inputStreamReader.read(chars) != -1){
        System.out.println(chars);
      }
      inputStreamReader.close();
      fileInputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
