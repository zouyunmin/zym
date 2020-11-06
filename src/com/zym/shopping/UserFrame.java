package com.zym.shopping;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserFrame {
  private JPanel jPanel1;
  private JPanel jPanel2;
  private JTable jTable1;
  private JTextField jTextField1;
  private JButton jButton1;
  private JLabel jLabel1;
  private JScrollPane jsp;
  private JTable jTable2;
  private ArrayList<User> user;

  public UserFrame() {
    jButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jTable1.setVisible(false);
        jTable2.setVisible(true);
        String name=jTextField1.getText();
        Dao.inquire(name);
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("商品信息");
    frame.setContentPane(new UserFrame().jPanel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(300,300,600,600);
    frame.setVisible(true);
  }

  private void createUIComponents() {
    // TODO: place custom component creation code here
    String[] head={"编号","商品名称","商品单价","库存"};
    user=Dao.selectUser();

    Object[][] date=new Object[user.size()][4];
    for (int i=0;i<user.size();i++){
      date[i][0]=user.get(i).getId();
      date[i][1]=user.get(i).getName();
      date[i][2]=user.get(i).getPrice();
      date[i][3]=user.get(i).getStore();
    }
    jTable1=new JTable(date,head);
  }
}
