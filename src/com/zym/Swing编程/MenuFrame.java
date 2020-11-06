package com.zym.Swing编程;

import com.zym.Swing编程.BaseJframe;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends BaseJframe {
  public MenuFrame(String title) {
    super(title);
    init();
  }

  public void init(){
    //创建菜单栏
    JMenuBar jMenuBar=new JMenuBar();

    //创建一级菜单
    JMenu bj=new JMenu("编辑");
    JMenu wj=new JMenu("文件");
    JMenu bz=new JMenu("帮助");

    //创建二级菜单
    JMenuItem xj=new JMenuItem("新建");
    JMenuItem dk=new JMenuItem("打开");

    //二级菜单加入到一级菜单
    bj.add(xj);
    bj.add(dk);

    ////一级菜单加入到菜单栏
    jMenuBar.add(bj);
    jMenuBar.add(wj);
    jMenuBar.add(bz);

    //菜单栏加入到父容器
    this.add(jMenuBar, BorderLayout.NORTH);
  }
}
