package com.advanced.T2;

public class Test3 {
  public static void main(String[] args) {
    //MyRunnable myRunnable=new MyRunnable();
    Thread thread=new Thread(new MyRunnable());
    thread.setName("邓");
    thread.start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        Thread.currentThread().setName("邓招良");
        for (int i = 0; i < 20; i++) {
          System.out.println(Thread.currentThread().getName()+i);
        }
      }
    }).start();
  }
}
