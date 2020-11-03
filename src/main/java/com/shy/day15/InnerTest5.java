package com.shy.day15;

/**
 * @ClassName InnerTest5
 * @Author shy
 * @deprecated 局部内部类
 * @Date 2020/11/3
 **/
public class InnerTest5 {
    public static void main(String[] args) {
        new Outer5().sayHi();
    }
}

class Outer5 {
    public void sayHi() {
        class InnerClass {
            InnerClass(String name) {
                System.out.println("InnerClass:" + name);
            }
        }
        System.out.println(new InnerClass("Three"));
        System.out.println("Hi,OutClass");
    }
}