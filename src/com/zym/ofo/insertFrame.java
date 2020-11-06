package com.zym.ofo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class insertFrame {
  private JPanel jPanel;
  private JTextField textName;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JTextField textBalance;
  private JLabel jLabel3;
  private JTextField textMileage;
  private JLabel jLabel4;
  private JButton jButton1;
  private JButton jButton2;


  public insertFrame() {
    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String name=textName.getText();
        float balance= Float.parseFloat(textBalance.getText());
        float mileage= Float.parseFloat(textMileage.getText());
        if(Dao.insertUser(name,balance,mileage)){
          JOptionPane.showMessageDialog(jPanel,"增加成功");
        }else {
          JOptionPane.showMessageDialog(jPanel,"增加失败");
        }
      }
    });
  }

  public void add(){
    JFrame frame = new JFrame("增加");
    frame.setContentPane(new insertFrame().jPanel);
    frame.setBounds(300,300,300,200);
    frame.setVisible(true);
  }
}
