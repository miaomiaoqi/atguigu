package com.miaoqi.itheima.jvmdemo.t4;

public class Singleton {
    private static Singleton INSTANCE = null;
    public static void main(String[] args) {
        INSTANCE =  new Singleton();
    }
}
