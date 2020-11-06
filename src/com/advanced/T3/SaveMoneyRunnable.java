package com.advanced.T3;

import java.util.Random;

public class SaveMoneyRunnable implements Runnable {

  private BankAccont bankAccont;
  private Random random=new Random();

  public SaveMoneyRunnable(BankAccont bankAccont) {
    this.bankAccont = bankAccont;
  }

  @Override
  public void run() {
    bankAccont.setBalance(0);
    for (int i = 0; i <10 ; i++) {
      int money=random.nextInt(10000);
      int number=money+bankAccont.getBalance();
      bankAccont.setBalance(number);
      System.out.println(bankAccont.getName()+"往"+Thread.currentThread().getName()+"存入："+money+"元"+"；余："+number);
    }
  }
}
