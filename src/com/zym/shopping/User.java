package com.zym.shopping;

public class User {
  private int id;
  private String name;
  private int price;
  private int store;

  public User(int id, String name, int price, int store) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.store = store;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getStore() {
    return store;
  }

  public void setStore(int store) {
    this.store = store;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", price=" + price +
      ", store=" + store +
      '}';
  }
}
