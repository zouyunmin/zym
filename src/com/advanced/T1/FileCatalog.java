package com.advanced.T1;

import java.io.File;

public class FileCatalog {
  public static void main(String[] args){
      File file=new File("D://ATA");
      showFile(file);
  }

  private static void showFile(File file){
    if (file.isDirectory()){
      File[] file1=file.listFiles();
      for (int i=1;i<file1.length;i++){
        File newFile=file1[i];
        showFile(newFile);
      }
    }else {
      System.out.println(file.getName());
    }
  }
}
