package com.advanced.T2;

public class Test1 {
  public static void main(String[] args) {
    MyRunnable myRunnable=new MyRunnable();
    Thread thread=new Thread(myRunnable);
    thread.setName("小小邓");
    thread.start();

    Thread thread1=new Thread(myRunnable);
    thread1.setName("小小王");
    thread1.start();

    Thread thread2=new Thread(myRunnable);
    thread2.setName("邓招良");
    thread2.start();
  }
}
