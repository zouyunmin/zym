package com.advanced.T2;

public class T {
    public static void main(String[] args){
        MyRunnable1 myRunnable1=new MyRunnable1();
        Thread thread=new Thread(myRunnable1);
        thread.setName("邓招良");
        thread.start();
    }
}
