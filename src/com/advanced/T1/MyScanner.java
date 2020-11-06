package com.advanced.T1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyScanner {
  public static void main(String[] args) {
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    String line=null;
    System.out.print("请输入：");
    try {
      while (((line=bufferedReader.readLine()) != null)){
        System.out.println(line);
      }
      bufferedReader.close();
      inputStreamReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }
}
