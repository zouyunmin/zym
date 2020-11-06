package com.zym.advanced.T1;

import java.io.File;

public class FileDmeo {
    public static void main(String[] args){
        File file=new File("D://");
        showFile(file);
    }

    private static void showFile(File file){
        if (file.isDirectory()){
            File[] files=file.listFiles();
            for (int i=0;i<files.length;i++){
                File newFile=files[i];
                showFile(newFile);
            }
        }else {
            System.out.println(file.getName());
        }
    }
}
