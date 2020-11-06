package com.zym.Swing编程;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends BaseJframe {

  public Login(String title){
    super(title);
  }

  public static void main(String[] args){
    Login login=new Login("登录页面");
    login.setVisible(true);

    JButton jButton=new JButton("跳转");
    jButton.setBounds(0,0,100,50);

//    com.zym.Swing编程.Login login1=new com.zym.Swing编程.Login("跳转页面");
//    FlowLayout flowLayout=new FlowLayout();
//    login1.setLayout(flowLayout);

    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
//        JFrame jFrame1=new JFrame("邓招良");
//        jFrame1.setBounds(300,300,300,300);
//         login.newJFrame(login1);
            JTableFrame jTableFrame=new JTableFrame("表");
            login.newJFrame(jTableFrame);

      }
    });

    JButton jButton2=new JButton("菜单");
    jButton2.setBounds(0,50,100,50);

    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MenuFrame menuFrame=new MenuFrame("菜单");
        login.newJFrame(menuFrame);

      }
    });



    login.add(jButton);
    login.add(jButton2);


  }
}
