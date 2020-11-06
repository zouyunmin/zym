package com.zym.ofo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Modify {
  private JPanel jPanel1;
  private JTextField jTextField1;
  private JTextField jTextField2;
  private JTextField jTextField3;
  private JTextField jTextField4;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JButton jButton2;
  private JButton jButton1;
  private User user;


  public Modify(User user){
    jButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int id= Integer.parseInt(jTextField1.getText());
        String name=jTextField2.getText();
        float balance= Float.parseFloat(jTextField3.getText());
        float mileage= Float.parseFloat(jTextField4.getText());
        if (Dao.updateUser(id,name,balance,mileage)){
          JOptionPane.showMessageDialog(jPanel1,"修改成功");
        }else {
          JOptionPane.showMessageDialog(jPanel1,"修改失败");
        }
      }
    });
    this.user=user;
    jTextField1.setText(String.valueOf(user.getId()));
    jTextField2.setText(user.getName());
    jTextField3.setText(String.valueOf(user.getBalance()));
    jTextField4.setText(String.valueOf(user.getMileage()));
  }

  public void manage(){
    JFrame frame = new JFrame("修改ofo共享单车用户信息");
    frame.setContentPane(jPanel1);
    frame.setBounds(200,100,300,200);
    frame.setVisible(true);
  }


}
