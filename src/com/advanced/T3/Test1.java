package com.advanced.T3;

public class Test1 {
  public static void main(String[] args) {
    Robber robber=new Robber();
    Police police=new Police();

    LockRunnable lockRunnable=new LockRunnable(robber,police,true);
    new Thread(lockRunnable).start();

    LockRunnable lockRunnable1=new LockRunnable(robber,police,false);
    new Thread(lockRunnable1).start();

    LockRunnable lockRunnable2=new LockRunnable(robber,police,true);
    new Thread(lockRunnable2).start();
  }
}
