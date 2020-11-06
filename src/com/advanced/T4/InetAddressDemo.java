package com.advanced.T4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
  public static void main(String[] args) {
    try {
      InetAddress inetAddress=InetAddress.getByName("www.baidu.com");
      System.out.println("主机的ip："+inetAddress.getHostAddress());
      System.out.println("主机的名字："+inetAddress.getHostName());
      System.out.println("本机的ip"+InetAddress.getLocalHost());
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

  }
}
