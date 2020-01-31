package com.atguigu.bean;

public class Customers extends Persons{
    public static void main(String[] args) {
        System.out.println("helloworld!!!");
    }

    @Override
    public void eat() {
        System.out.println("陪客户吃饭");
    }
}
