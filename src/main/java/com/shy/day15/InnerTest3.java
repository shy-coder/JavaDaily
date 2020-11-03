package com.shy.day15;

/**
 * @ClassName InnerTest3
 * @Author shy
 * @deprecated 外部类访问内部类
 * @Date 2020/11/3
 **/
public class InnerTest3 {
    public static void main(String[] args) {
        new Outer3().sayHi();
    }
}

class Outer3 {
    public void sayHi() {
        System.out.println(new Inner3().name);
        System.out.println("Hi,Outer");
    }
    private class Inner3 {
        String name = "InnerClass";
        public void sayHi() {
            System.out.println("Hi,Inner.");
        }
    }
}