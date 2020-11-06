package com.zym.Swing编程;

import javax.swing.*;

public class BaseJframe extends JFrame {
  public  BaseJframe(String title){
    super(title);

    ImageIcon imageIcon=new ImageIcon("img//ic_launcher.png");
    setIconImage(imageIcon.getImage());
    setBounds(300,300,300,300);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public  void newJFrame(JFrame jFrame ){
    this.setVisible(false);
    jFrame.setVisible(true);
  }
}
