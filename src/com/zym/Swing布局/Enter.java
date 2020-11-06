package com.zym.Swing布局;

import com.zym.Swing布局.ActionDemo;

public class Enter {
  public static void main(String[] args){
      Student student=new Student();
      student.Action(new ActionDemo() {
        @Override
        public void dosomething() {
          System.out.println("邓招良");
        }
      });
      student.dosomething1();
  }
}
