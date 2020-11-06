package com.advanced.T1;

import java.io.File;
import java.io.IOException;

public class FileDemo {

  /**
   * 使用File操作文件
   * @param args
   */
  public static void main(String[] args){
    File file=new File("hello.txt");
    if (!file.exists()){
      System.out.println("文件不存在");
      try {
        file.createNewFile();
        System.out.println("文件创建成功");
      } catch (IOException e) {
        e.printStackTrace();
      }
      String name=file.getName();
      System.out.println("文件名;"+name);
      String path=file.getPath();
      System.out.println("文件相对路径："+path);
      System.out.println("文件绝对路径;"+file.getAbsolutePath());
      long length=file.length();
      System.out.println("文件长度："+length);
      file.delete();
      System.out.println("文件是否存在"+file.exists());
      File[] files=file.listFiles();
      if (file.isDirectory()){
        for (int i=0;i<files.length;i++){
          if (files[i].getName().endsWith(".txt")){
            System.out.println(files[i].getName());
          }
        }
      }else {
        System.out.println(file.getName());
      }
    }
  }
}
