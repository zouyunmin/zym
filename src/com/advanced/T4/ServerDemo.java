package com.advanced.T4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket=new ServerSocket(6666);
      System.out.println("服务端创建成功");
      //客户端连接成功
      Socket socket=serverSocket.accept();
      System.out.println("有客户端连接成功");

      new Thread(new SendRunnable(socket)).start();
      new Thread(new AcceptRunnable(socket)).start();

//      //获取socket输出流
//      OutputStream outputStream=socket.getOutputStream();
//      OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
//      BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
//      //创建输入流，从键盘输入
//      InputStreamReader inputStreamReader=new InputStreamReader(System.in);
//      BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
//      String str=null;
//      while ((str=bufferedReader.readLine())!=null){
//        bufferedWriter.write(str);
//        bufferedWriter.newLine();
//        bufferedWriter.flush();
//      }
//      //printWriter.close();
//      outputStream.close();
//      outputStreamWriter.close();
//      bufferedWriter.close();
//      inputStreamReader.close();
//      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
