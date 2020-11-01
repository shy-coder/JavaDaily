package com.shy.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TraversalList
 * @Description 遍历List的多种方式
 * @Author shy
 * @Date 2020/10/24
 **/
public class TraversalList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("tom","cat","Jane","jerry"));

        //方法一 集合类的通用遍历方式，从很早的版本就有，用迭代器迭代
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next());
        }
        System.out.println();

        //方法二 集合类的通用遍历方式，从很早的版本就有，用迭代器迭代
        for (Iterator it2 = list.iterator(); it2.hasNext();){
            System.out.print(it2.next());
        }
        System.out.println();

        //方法三 增强型for循环遍历
        for (String value : list){
            System.out.print(value);
        }
        System.out.println();

        //方法四 一般性for循环遍历
        for (int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //方法五 lambda遍历
        list.forEach(item -> System.out.print(item));
        System.out.println();

        //方法六 终极简洁版（方法引用)
        list.forEach(System.out::print);

    }
}
