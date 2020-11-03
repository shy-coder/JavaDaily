package com.shy.day15;

/**
 * @ClassName InnerTest2
 * @Author shy
 * @deprecated 内部类访问外部类
 * @Date 2020/11/3
 **/
public class InnerTest2 {
    public static void main(String[] args) {
        Outer2.Inner inner = new Outer2().new Inner();
        inner.sayHi();
    }
}

class Outer2 {
    private String name = "OuterClass";
    public void sayHi() {
        System.out.println("Hi,Outer.");
    }
    class Inner {
        public void sayHi() {
            Outer2.this.sayHi();
            System.out.println(Outer2.this.name);
            System.out.println("Hi,Inner.");
        }
    }
}
