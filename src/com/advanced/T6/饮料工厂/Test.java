package com.advanced.T6.饮料工厂;

public class Test {
    public static void main(String[] args) {
        Drink drink=DrinkFactory.makeDrink(1);
        drink.taste();
        Drink drink1=DrinkFactory.makeDrink(2);
        drink1.taste();
        Drink drink2=DrinkFactory.makeDrink(3);
        drink2.taste();
    }
}
