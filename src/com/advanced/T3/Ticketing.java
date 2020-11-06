package com.advanced.T3;

public class Ticketing {
  private int number=50;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public synchronized void taket(){
    if (number>0){
      System.out.println(Thread.currentThread().getName()+"出售第"+number+"张车票");
      number--;
    }else {
      System.out.println(Thread.currentThread().getName()+"已售空");
    }
  }
}
