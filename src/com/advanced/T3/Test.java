package com.advanced.T3;

public class Test {
  public static void main(String[] args) {
    /**
     * 实现Runnable接口启动
     */
    Ticketing ticketing=new Ticketing();
    StationThread stationThread=new StationThread(ticketing);
    new Thread(stationThread,"窗口1").start();
    new Thread(stationThread,"窗口2").start();
    new Thread(stationThread,"窗口3").start();

    /**
     * 继承Thread启动
     */
//    Ticketing ticketing=new Ticketing();
//    new StationThread(ticketing).start();

  }
}
