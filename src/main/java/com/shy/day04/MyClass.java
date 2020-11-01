package com.shy.day04;

/**
 * @ClassName MyClass
 * @Description 成员变量、静态变量、成员方法、静态方法
 * @Author shy
 * @Date 2020/10/23
 **/
public class MyClass {
    //成员变量
    int num;
    //静态变量
    static int numStatic;

    /**
     * 成员方法
     */
    public void method() {
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    /**
     * 静态方法
     */
    public static void methodStatic() {
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态不能直接访问非静态（重点）
        //System.out.println(num); 错误写法
        //静态方法中不能使用this关键字
        //System.out.println(this); X
    }

}
