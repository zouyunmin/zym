package com.advanced.T3;

public class LockRunnable implements Runnable {
  private Robber robber;
  private Police police;
  private boolean flag=false;

  public LockRunnable(Robber robber, Police police, boolean flag) {
    this.robber = robber;
    this.police = police;
    this.flag = flag;
  }

  @Override
  public void run() {
      if (flag){
        synchronized (police){
          police.talk();
          synchronized (robber){
            robber.dosomething();
          }
          police.dosomething();
        }
      }else {
        synchronized (robber){
          robber.talk();
          synchronized (police){
            police.dosomething();
          }
          robber.dosomething();
        }
      }
  }
}
