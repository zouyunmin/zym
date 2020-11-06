package com.advanced.T2;

public class Test {
  public static void main(String[] args) {
    MyThread myThread=new MyThread();
    myThread.setName("线程A");
    myThread.start();

    MyThread myThread1=new MyThread();
    myThread1.setName("线程B");
    myThread1.start();

    MyThread myThread2=new MyThread();
    myThread2.setName("邓招良");
    myThread2.start();

    MyThread myThread3=new MyThread();
    myThread3.setName("王家桐");
    myThread3.start();

    /**
     * 主线程
     */
    for (int i = 0; i <15 ; i++) {
      System.out.println(Thread.currentThread().getName()+i);
    }
  }
}
