package com.zym.Swing编程;

import com.zym.Swing编程.ActionDemo;

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
