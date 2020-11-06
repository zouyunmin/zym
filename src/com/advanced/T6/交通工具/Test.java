package com.advanced.T6.交通工具;

public class Test {
    public static void main(String[] args) {
        Vehicle car= Factory.makeVehicle(1);
        car.move();
        Vehicle truck=Factory.makeVehicle(2);
        truck.move();
        Vehicle train=Factory.makeVehicle(3);
        train.move();
    }
}
