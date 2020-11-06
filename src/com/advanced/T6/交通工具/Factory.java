package com.advanced.T6.交通工具;

public class Factory {

    public static Vehicle makeVehicle(int type){
        if (type==1){
            return new Car();
        }else if (type==2){
            return  new Truck();
        }else if (type==3){
            return new Train();
        }else {
            return null;
        }
    }
}
