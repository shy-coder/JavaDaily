package com.shy.day04;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description Arrays练习
 * @Author shy
 * @Date 2020/10/23
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
 * public static String toString(数组)：将参数数组变成字符串(按照默认格式：[元素1,元素2,元素3...])
 * public static String sort(数组)：按照默认升序(从小到大)对数组的元素进行排序
 *备注：
 * 1.如果是数值，sort默认按照升序从小到大
 * 2.如果是字符串，sort默认按照字母排序
 * 3.如果是自定义的类型，那么这个自定义的类型需要有Comparable或者Comparator接口的支持
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        //对整型数组排序
        int[] array1 = {2,1,3,7,9};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        //对字符串数组排序
        String[] array2 = {"aaa","ccc","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        //将一个随机字符串中的所有字符升序排列，并倒序打印
        String str = "adsad3123fa";
        //如何进行升序排列：sort
        //必须是一个数组，才能用Arrays.sort方法
        //String-->数组，用toCharArray
        char[] chars = str.toCharArray();
        //对字符数组进行升序排序
        Arrays.sort(chars);
        //倒叙遍历
        for (int i = chars.length-1; i >= 0; i--){
            System.out.print(chars[i] + " ");
        }
    }
}
