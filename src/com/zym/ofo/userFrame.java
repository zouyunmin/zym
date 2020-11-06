package com.zym.ofo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class userFrame {
  private JPanel jPanel;
  private JTable jTable;
  private JPanel jPanel2;
  private JButton jButton1;
  private JButton jButton2;
  private JButton jButton3;
  private ArrayList<User> users;

  //修改
  public userFrame() {
    jButton1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int a=jTable.getSelectedRow();
        if (a<0){
          JOptionPane.showMessageDialog(jPanel,"请选择一条数据");
        }
        User user=users.get(a);
        Modify modify=new Modify(user);
        modify.manage();
      }
    });

    //新增
    jButton2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        insertFrame insertFrame=new insertFrame();
        insertFrame.add();
      }
    });

    //删除
    jButton3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          int a=jTable.getSelectedRow();
          User user=users.get(a);
          String name=user.getName();
          if (Dao.deleteUser(name)){
            JOptionPane.showMessageDialog(jPanel,"删除成功");
          }
      }
    });
  }

  public static void main(String[] args) {
   userFrame userFrame=new userFrame();
   userFrame.view();
  }

  public void view(){
    JFrame frame = new JFrame("ofo共享单车用户信息管理");
    frame.setContentPane(new userFrame().jPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(300,300,600,600);
    frame.setVisible(true);
  }

  private void createUIComponents() {
    // TODO: place custom component creation code here
    String[] head={"序号","姓名","账户余额（元）","骑行里程（KM)"};
    users=Dao.selectUser();

    Object[][] date=new Object[users.size()][4];
    for (int i=0;i<users.size();i++){
      date[i][0]=users.get(i).getId();
      date[i][1]=users.get(i).getName();
      date[i][2]=users.get(i).getBalance();
      date[i][3]=users.get(i).getMileage();
    }
    jTable=new JTable(date,head);
  }
}
