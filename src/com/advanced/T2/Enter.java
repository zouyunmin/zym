package com.advanced.T2;

public class Enter {
  public static void main(String[] args) {
    Account account=new Account("123456",16000);

    GetMoneyThread getMoneyThread=new GetMoneyThread(account,6000);
    getMoneyThread.setName("小小邓");
    getMoneyThread.start();

    GetMoneyThread getMoneyThread1=new GetMoneyThread(account,10000);
    getMoneyThread1.setName("小邓");
    getMoneyThread1.start();

    GetMoneyThread getMoneyThread2=new GetMoneyThread(account,5000);
    getMoneyThread2.setName("小小小邓");
    getMoneyThread2.start();
  }
}
