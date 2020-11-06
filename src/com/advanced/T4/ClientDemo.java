package com.advanced.T4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientDemo {
  public static void main(String[] args) {
    try {
      //本机127.0.0.1
      Socket socket=new Socket("192.168.10.72",6666);
      new Thread(new AcceptRunnable(socket)).start();
      new Thread(new SendRunnable(socket)).start();


//      //创建输入流
//      InputStreamReader inputStreamReader=new InputStreamReader(socket.getInputStream());
//      BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
//      String str=null;
//      while ((str=bufferedReader.readLine())!=null){
//        System.out.println(str);
//        if (str.equals("i")){
//          break;
//        }
//      }
//      bufferedReader.close();
//      inputStreamReader.close();
//      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
