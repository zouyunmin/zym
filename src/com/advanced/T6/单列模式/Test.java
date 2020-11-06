package com.advanced.T6.单列模式;

public class Test {
    public static void main(String[] args) {
        Student student=Student.getInstance();
        System.out.println(student);
    }
}
