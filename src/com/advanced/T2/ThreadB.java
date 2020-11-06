package com.advanced.T2;

public class ThreadB extends Thread {
  private ThreadA threadA;
  public ThreadB(ThreadA threadA){
    this.threadA=threadA;
  }

  @Override
  public void run() {
    try {
      threadA.join();
      System.out.println("邓招良的活跃状态："+threadA.isAlive());
      for (int i = 0; i < 20; i++) {
        System.out.println(getName()+i);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("小邓的活跃状态："+isAlive());
  }
}
