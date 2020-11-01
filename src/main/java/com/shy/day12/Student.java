package com.shy.day12;

import lombok.ToString;

/**
 * @ClassName Student
 * @Description TODO
 * @Author shy
 * @Date 2020/10/31
 **/
public class Student {
    private String name;
    private int age;
    private int stature;

    public Student(String name, int age, int stature) {
        super();
        this.name = name;
        this.age = age;
        this.stature = stature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getstature() {
        return stature;
    }

    public void setstature(int stature) {
        this.stature = stature;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stature=" + stature +
                '}';
    }
}