package com.zym.advanced.T1;

import java.io.File;
import java.io.IOException;

/**
 * 使用File类操作文件
 */
public class FileSimple {
    public static void main(String[] args){
       //创建File对象
        File file=new File("test.txt");
        //判断该文件是否存在
        if (!file.exists()){
            System.out.println("该文件不存在");
            try {
                //创建文件test.txt
                file.createNewFile();
                System.out.println("该文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //获取文件名
            String fileName=file.getName();
            System.out.println("文件名："+fileName);
            //获取文件路径
            String path=file.getPath();
            System.out.println("文件路径："+path);
            //获取文件绝对路径
            String absolute=file.getAbsolutePath();
            System.out.println("文件绝对路径："+absolute);
            //获取文件大小
            long length=file.length();
            System.out.println("文件大小："+length);
            //判断File是否为文件，而非目录
            System.out.println("判断File是否为文件，而非目录："+file.isFile());
            //删除该文件
            file.delete();
            System.out.println("该文件是否存在："+file.exists());
        }
    }
}
