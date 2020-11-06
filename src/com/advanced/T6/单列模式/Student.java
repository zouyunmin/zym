package com.advanced.T6.单列模式;

public class Student {
    private static Student instance=new Student();
    private Student(){

    }

    public static Student getInstance(){
        return instance;
    }
}
