package com.zym.fuxi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class UpdateJdbc {
  private JPanel jPanel;
  private JLabel jLabel;
  private JTextField jTextField;
  private JLabel jLabel2;
  private JPasswordField jPasswordField;
  private JButton jButton;

  public UpdateJdbc() {
    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String username=jTextField.getText();
        String password=jPasswordField.getText();
      }
    });
  }

  public boolean update(String username,String password){

    Connection connection=DUBlit.getConnection();


    return  false;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("UpdateJdbc");
    frame.setContentPane(new UpdateJdbc().jPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
