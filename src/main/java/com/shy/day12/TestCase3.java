package com.shy.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName TestCase3
 * @Author shy
 * @Date 2020/11/1
 **/
public class TestCase3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞",22,175));
        students.add(new Student("红发",40,180));
        students.add(new Student("白胡子",50,185));

        List<String> names = students.stream().map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
