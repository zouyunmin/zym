package com.advanced.T2;

public class MyRunnable implements Runnable {
  private int i=0;
  @Override
  public void run() {
    for (; i < 20; i++) {
      System.out.println(Thread.currentThread().getName()+i);
    }
  }
}
