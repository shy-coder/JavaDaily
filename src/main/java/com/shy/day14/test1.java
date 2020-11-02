package com.shy.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName test1
 * @Author shy
 * @Date 2020/11/2
 **/
public class test1 {
    public static void main(String[] args) {
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher("2437309168@qq.1cn");
        boolean isMatched = matcher.matches();
        System.out.println(isMatched);

    }
}
