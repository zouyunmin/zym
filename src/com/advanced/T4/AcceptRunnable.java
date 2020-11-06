package com.advanced.T4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class AcceptRunnable implements Runnable {
  private BufferedReader reader;

  public AcceptRunnable(Socket socket) {
    try {
      InputStream inputStream=socket.getInputStream();
      InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
      reader=new BufferedReader(inputStreamReader);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    String line=null;
    try {
      while ((line=reader.readLine())!=null){
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
