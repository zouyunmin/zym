package com.zym.ofo;

public class User {
  private int id;
  private String name;
  private float balance;
  private float mileage;

  public User(int id, String name, float balance, float mileage){
    this.id=id;
    this.name=name;
    this.balance=balance;
    this.mileage=mileage;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public float getMileage() {
    return mileage;
  }

  public void setMileage(float mileage) {
    this.mileage = mileage;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
