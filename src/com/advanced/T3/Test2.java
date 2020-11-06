package com.advanced.T3;

public class Test2 {
  public static void main(String[] args) {
    BankAccont bankAccont=new BankAccont();
    SaveMoneyRunnable saveMoneyRunnable=new SaveMoneyRunnable(bankAccont);
    bankAccont.setName("邓招良");
    new Thread(saveMoneyRunnable,"天地银行").start();
    new Thread(saveMoneyRunnable,"天银行").start();
  }
}
