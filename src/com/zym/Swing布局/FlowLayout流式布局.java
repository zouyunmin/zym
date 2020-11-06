package com.zym.Swing布局;

import javax.swing.*;
import java.awt.*;

public class FlowLayout流式布局 {
  public static void main(String[] args){
    JFrame jFrame=new JFrame("邓招良");
    jFrame.setBounds(300,300,300,300);

    FlowLayout flowLayout=new FlowLayout();
    jFrame.setLayout(flowLayout);

    flowLayout.setHgap(10);
    flowLayout.setVgap(20);

    for (int i=0;i<5;i++){
          jFrame.add(new JButton("王家桐"));
          jFrame.add(new JButton("邓招良"));
    }

    //设置默认关闭
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    jFrame.setVisible(true);
  }
}
