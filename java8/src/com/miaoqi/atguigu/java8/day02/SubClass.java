package com.miaoqi.atguigu.java8.day02;

public class SubClass /*extends MyClass*/ implements MyFun, MyInterface {

    @Override
    public String getName() {
        return MyInterface.super.getName();
    }

}