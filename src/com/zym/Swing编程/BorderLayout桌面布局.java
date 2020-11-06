package com.zym.Swing编程;

import javax.swing.*;
import java.awt.*;

public class BorderLayout桌面布局 {
  public static void main(String[] args){
    JFrame jFrame=new JFrame();
    jFrame.setBounds(300,300,300,300);

    BorderLayout borderLayout=new BorderLayout();
    //设置父容器布局
    jFrame.getContentPane().setLayout(borderLayout);

    //创建控件
    JButton jButton1=new JButton("东");
    JButton jButton2=new JButton("西");
    JButton jButton3=new JButton("南");
    JButton jButton4=new JButton("北");
    JButton jButton5=new JButton("中");

    //添加控件到父容器
    jFrame.add(jButton1,borderLayout.EAST);
    jFrame.add(jButton2,borderLayout.WEST);
    jFrame.add(jButton3,borderLayout.SOUTH);
    jFrame.add(jButton4,borderLayout.NORTH);
    jFrame.add(jButton5,borderLayout.CENTER);


    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    jFrame.setVisible(true);
  }
}
