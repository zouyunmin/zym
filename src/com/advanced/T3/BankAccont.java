package com.advanced.T3;

public class BankAccont {
  private String name;
  private ThreadLocal<Integer> balance=new ThreadLocal<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance.get();
  }

  public void setBalance(int balance) {
    this.balance.set(balance);
  }
}
