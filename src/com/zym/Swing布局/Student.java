package com.zym.Swing布局;

import com.zym.Swing布局.ActionDemo;

public class Student {
  private ActionDemo actionDemo;

  public  Student(){ }

  public  void  Action(ActionDemo actionDemo){
    this.actionDemo=actionDemo;
  }

  public  void  dosomething1(){
    actionDemo.dosomething();
  }
}
