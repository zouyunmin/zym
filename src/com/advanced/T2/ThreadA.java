package com.advanced.T2;

public class ThreadA extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      try {
        Thread.sleep(1000);
        System.out.println(getName()+i+"的活跃状态"+isAlive());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
