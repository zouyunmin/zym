package com.advanced.T2;

public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10000000;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
