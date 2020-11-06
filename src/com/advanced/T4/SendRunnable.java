package com.advanced.T4;

import java.io.*;
import java.net.Socket;

public class SendRunnable implements Runnable {
  private BufferedReader reader;
  private BufferedWriter writer;

  public SendRunnable(Socket socket) throws IOException {
    //创建输入流，监听键盘输入
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    reader=new BufferedReader(inputStreamReader);
    //创建输出流，输出到socket
    OutputStreamWriter outputStreamWriter=new OutputStreamWriter(socket.getOutputStream());
    writer=new BufferedWriter(outputStreamWriter);
  }

  @Override
  public void run() {
    String line=null;
    try {
      while (((line=reader.readLine())!=null)){
        writer.write(line);
        writer.newLine();
        writer.flush();
      }
      writer.close();
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
