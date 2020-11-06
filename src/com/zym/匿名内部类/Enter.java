package com.zym.匿名内部类;

public class Enter {
  public static void main(String[] args){
      Human human=new Human();
      human.addTiaowu(new TiaowuItm());
      human.tiaowu();

      Human human1=new Human();
      human1.addTiaowu(new Tiaowu() {
        @Override
        public void tiaowu() {
          System.out.println("邓招良跳舞");
        }
      });
      human1.tiaowu();


      Student student=new Student();
      student.Tiaowu(new Tiaowu() {
        @Override
        public void tiaowu() {
          System.out.println("王家桐喝奶之丘比特之箭");
        }
      });
  }
}
