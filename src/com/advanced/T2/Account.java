package com.advanced.T2;

public class Account {
  private String name;
  private int balance;

  public Account(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void takeMoney(int money){
    if (balance>=money){
          System.out.println(Thread.currentThread().getName()+"取钱"+money+"元");
          int left=balance-money;
          setBalance(left);
          System.out.println("余额"+getBalance());
    }else {
      System.out.println("余额不足");
    }
  }
}
