package com.shy.day04;

/**
 * @ClassName MathDemo
 * @Description Math练习
 * @Author shy
 * @Date 2020/10/23
 * java.util.Math类是数学县官的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
 * public static double abs(double num):获取绝对值，有多种重载
 * public static double ceil(double num):向上取整
 * public static double floor(double num):向下取整
 * public static double round(double num):四舍五入
 * Math.PI代表近似的圆周率常量(double)
 **/
public class MathDemo {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("-----------------------");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("-----------------------");

        //向下取整，抹零
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));
        System.out.println("-----------------------");

        //四舍五入
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(30.5));

        //计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间之内所有的整数
        for (int i = (int) min; i < max; i++){
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("总共有："+ count + "个");
    }
}
