package com.advanced.T2;

public class Test2 {
  public static void main(String[] args) {
    ThreadA threadA=new ThreadA();
    threadA.setName("邓招良");
    threadA.start();

    ThreadB threadB=new ThreadB(threadA);
    threadB.setName("小邓");
    threadB.start();

    MyRunnable myRunnable=new MyRunnable();
    Thread thread=new Thread(myRunnable);
    thread.setName("小小邓");
    thread.start();
  }
}
