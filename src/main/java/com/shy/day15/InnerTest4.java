package com.shy.day15;

/**
 * @ClassName InnerTest4
 * @Author shy
 * @deprecated 静态成员内部类
 * @Date 2020/11/3
 **/
public class InnerTest4 {
    public static void main(String[] args) {
        Outer4.InnerClass innerClass = new Outer4.InnerClass();
        innerClass.sayHi();
    }
}

class Outer4 {
    public Outer4() {
        System.out.println("OuterClass Init.");
    }
    protected static class InnerClass {
        public void sayHi() {
            System.out.println("Hi,InnerClass");
        }
    }
}