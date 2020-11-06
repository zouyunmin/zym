package com.advanced.T3;

public class StationThread implements Runnable{

  private Ticketing ticketing;

  public StationThread(Ticketing ticketing){
    this.ticketing=ticketing;
  }

  @Override
  public void run() {
    while (true){
//      try {
//        Thread.sleep(500);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
      if (ticketing.getNumber()<=0){
        break;
      }else {
        ticketing.taket();
      }
    }
  }
}
