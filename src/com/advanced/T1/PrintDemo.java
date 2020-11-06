package com.advanced.T1;

import java.io.File;
import java.io.PrintStream;

public class PrintDemo {
  public static void main(String[] args) {
    File file=new File("hello.txt");
    PrintStream printStream=new PrintStream(System.out);
    printStream.println("换行");
    printStream.print("不换行");
    printStream.print("不换行");
    printStream.close();
  }
}
