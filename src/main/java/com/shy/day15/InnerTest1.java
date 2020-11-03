package com.shy.day15;

/**
 * @ClassName InnerTest1
 * @Author shy
 * @deprecated 成员内部类练习
 * @Date 2020/11/3
 **/
public class InnerTest1 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        //创建成员内部类
        Outer1.Inner1 inner = outer.new Inner1();
        inner.sayHi();
    }
}
class Outer1 {
    public Outer1() {
        System.out.println("Outer Class.");
    }
    class Inner1 {
        public void sayHi(){
            System.out.println("Hi, Inner.");
        }
    }
}
