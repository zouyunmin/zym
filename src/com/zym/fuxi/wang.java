package com.zym.fuxi;

import javax.swing.*;

public class wang {
  private JPanel panel1;
  private JTextField textField1;
  private JPasswordField passwordField1;
  private JButton Button1;
  private JButton Button2;
  private JLabel jLabel;
  private JLabel jLabel2;

  public static void main(String[] args) {
    JFrame frame = new JFrame("wang");
    frame.setContentPane(new wang().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
