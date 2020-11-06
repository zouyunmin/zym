package com.advanced.T2;

public class GetMoneyThread extends Thread {
  private Account account;
  private int money;

  public GetMoneyThread(Account account,int money){
    this.account=account;
    this.money=money;
  }

  @Override
  public void run() {
    account.takeMoney(money);
  }
}
