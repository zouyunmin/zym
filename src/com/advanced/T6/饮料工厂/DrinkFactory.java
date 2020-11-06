package com.advanced.T6.饮料工厂;

public class DrinkFactory {
    public static Drink makeDrink(int type){
        if (type==1){
            return new Coco();
        }else if (type==2){
            return new Sprite();
        }else if (type==3){
            return new SixBoom();
        }else {
            return null;
        }
    }
}
