package com.zym.Swing编程;

import com.zym.Swing编程.BaseJframe;

import javax.swing.*;
import java.awt.*;

public class JTableFrame extends BaseJframe {
  public JTableFrame(String title) {
    super(title);
    this.init();
  }

  public  void init(){
    BorderLayout borderLayout=new BorderLayout();
    this.setLayout(borderLayout);

    String[] head={"ID","姓名","年龄","电话"};
    String[][] date={
      {"1","邓招良","15","147854"},
      {"2","邓招良2","16","147878"},
      {"3","邓招良3","17","247854"},
      {"4","邓招良4","18","697854"},
      {"5","邓招良5","19","179854"},
    };

    JTable jTable=new JTable(date,head);
    JScrollPane jScrollPane=new JScrollPane(jTable,
      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
      );
    this.add(jScrollPane,BorderLayout.CENTER);
    this.setVisible(true);

    MenuJpanel menuJpanel=new MenuJpanel();
    this.add(menuJpanel,BorderLayout.NORTH);
  }
  

}
