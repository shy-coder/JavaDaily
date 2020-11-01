package com.shy.day12;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName TestCase
 * @Author shy
 * @Date 2020/11/1
 **/
public class TestCase1 {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞", 22, 175),
                new Student("红发",40,180),
                new Student("白胡子",50,185)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
